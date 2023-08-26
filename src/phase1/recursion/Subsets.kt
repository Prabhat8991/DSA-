package phase1.recursion

fun main() {
  subsets(intArrayOf(1,2,3)).forEach {
      print(it)
  }
}

fun subsets(nums: IntArray): List<List<Int>> {
    val output = mutableListOf<Int>()
    val ans = mutableListOf<List<Int>>()
    solve(nums, output, 0, ans)
    return ans
}

fun solve(nums: IntArray, output: MutableList<Int>, index: Int, ans: MutableList<List<Int>>) {
    if (index >= nums.size) {
        ans.add(output)
        return
    }
    solve(nums, output, index + 1, ans)
    val element = nums[index]
    output.add(element)
    solve(nums, output, index + 1, ans)
}