package revision

fun main(args: Array<String>) {
    val nums = intArrayOf(1)
    val k =5
    rotate(nums, k)
    for(i in nums)
       print(i)
}
fun rotate(nums: IntArray, k: Int): Unit {
    val lastIndex = nums.size-1
    var rotateTimes = k
    if(k > nums.size) {
        rotateTimes = k%nums.size
    }
    if(rotateTimes > 0) {
        reverseArray(nums, 0, lastIndex)
        reverseArray(nums, rotateTimes, lastIndex)
        reverseArray(nums, 0, rotateTimes-1)
    }

}

fun reverseArray(nums: IntArray, startIndex: Int, endIndex: Int) {
    var i = startIndex
    var j = endIndex

    while(i < j) {
        var temp = 0
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        i++
        j--
    }
}