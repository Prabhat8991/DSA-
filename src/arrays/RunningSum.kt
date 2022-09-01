package arrays

fun main() {
   runningSum(intArrayOf(1,2,3,4,5)).forEach {
       print(it)
   }
}

fun runningSum(nums: IntArray): IntArray {
    val output = IntArray(nums.size)
    var sum = 0
    nums.forEachIndexed {index, i ->
      sum += nums[index]
      output[index] = sum
    }
    return output
}