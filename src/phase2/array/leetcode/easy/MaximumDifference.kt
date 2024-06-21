package phase2.array.leetcode.easy


fun main() {
    println(maximumDifference(intArrayOf(9,4,3,2)))
}
fun maximumDifference(nums: IntArray): Int {
  var min = nums[0]
  var maxDiff = -1

  for (i in 1..nums.size-1)  {
      if (min < nums[i]) {
          var diff = nums[i] - min
          if (diff > maxDiff) {
              maxDiff = diff
          }
      }
      if (nums[i] < min) {
          min = nums[i]
      }
  }
    return maxDiff

}
