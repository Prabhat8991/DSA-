package phase2.recursion

fun main() {
    var nums = intArrayOf(5,4,3,2,1)
    sortArray(nums)
    nums.forEach {
        println(it)
    }
}

fun sortArray(nums: IntArray): IntArray {
    quickSort(nums, 0, nums.size-1)
    return nums
}

fun quickSort(nums: IntArray, start: Int, end: Int) {
    if (start > end) {
        return
    }
    val partitionIndex = swap(nums, start, end)
    quickSort(nums, start, partitionIndex-1)
    quickSort(nums, partitionIndex+1, end)
}

fun swap(nums: IntArray, start: Int, end: Int): Int {
    var i = start
    var j = end
    var pivot = nums[start]
   while (i < j) {
       while (nums[i] <= pivot && i < end) {
           i++
       }

       while (nums[j] > pivot && i > start) {
           j--
       }

       if(i < j) {
           var temp = nums[i]
           nums[i] = nums[j]
           nums[j] = temp
       }
   }

    var temp = nums[start]
    nums[start] = nums[j]
    nums[j] = temp

    return j
}