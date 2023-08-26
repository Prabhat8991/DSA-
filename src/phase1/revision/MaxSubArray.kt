package phase1.revision

fun main() {
  print(maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
}

fun maxSubArray(nums: IntArray): Int {
    var sum = nums[0]
    var maxSum = sum
    for (i in 1 until nums.size) {
       sum = maxOf(nums[i], sum+nums[i])
       maxSum = maxOf(sum, maxSum)
    }
    return maxSum
}

fun maxOf(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else
        b
}

