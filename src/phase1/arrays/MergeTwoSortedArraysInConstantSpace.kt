package phase1.arrays

/**
 * [-1,0,0,3,3,3,0,0,0]
6
[1,2,2]
3
 */
fun main() {
    val nums1 = intArrayOf(-1,0,0,3,3,3,0,0,0)
    val nums2 = intArrayOf(1,2,2)
    merge(nums1, 6, nums2, 3)
    for (i in nums1) {
        print("$i ")
    }
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var counter1 = m - 1
    var counter2 = n - 1
    var k = m+n-1
    while(counter1 >= 0 && counter2 >= 0) {
        if(nums1[counter1] > nums2[counter2]) {
            nums1[k--] = nums1[counter1--]
        } else {
            nums1[k--] = nums2[counter2--]
        }
    }
    while(counter2 >= 0) {
        nums1[k--] = nums2[counter2--]
    }
}