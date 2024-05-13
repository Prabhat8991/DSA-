package phase2.array.leetcode.easy

fun main() {
   print(singleNumber(intArrayOf(4,1,2,1,2)))
}

fun singleNumber(nums: IntArray): Int {
    var result = 0
    for (i in 0..nums.size-1) {
        result = result.xor(nums[i])
    }
    return result
}
