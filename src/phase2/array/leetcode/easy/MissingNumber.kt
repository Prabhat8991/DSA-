package phase2.array.leetcode.easy

fun main() {

}

fun missingNumber(nums: IntArray): Int {
    var totalSum = 0
    for (i in 0..nums.size) {
        totalSum+=i
    }
    nums.forEach {
        totalSum-=it
    }

    return totalSum
}