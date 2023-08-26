package phase1.arrays

fun main() {
    val nums = intArrayOf(1,2,3,4,5,6)
    shuffle(nums, 3).forEach {
        print(it)
    }
}

fun shuffle(nums: IntArray, n: Int): IntArray {
    var i = 0
    var j = n
    val result = IntArray(2*n)
    var count = 0
    while (i < n && j <= (2*n-1)) {
       result[count] = nums[i++]
       result[++count] = nums[j++]
       count++
    }
    return result
}