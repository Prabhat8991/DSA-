package arrays

import java.util.*


fun main() {
    print(subarraySums(intArrayOf(-1,-1,1), 0))
}

fun subarraySums(nums: IntArray, k: Int): Int {
    var sum = 0
    var subArrayCount = 0
    var map = mutableMapOf<Int, Int>()
    nums.forEach {
        sum += it
        if (sum == 0 && it == k) {
            subArrayCount++
        } else if (sum == k) {
            subArrayCount++
            if (map.containsKey(0)) {
                subArrayCount += map[0] ?: 0
            }
        }
        else if (sum > k) {
            if (map.containsKey(sum - k)) {
                subArrayCount += map[sum - k] ?: 0
            }
        }
        map[sum] = map.getOrDefault(sum, 0).plus(1)
    }
    return subArrayCount
}

fun subarraySum(nums: IntArray, k: Int): Int {
    // HashMap to store number of subarrays
    // starting from index zero having
    // particular value of sum.
    val prevSum = HashMap<Int, Int?>()
    prevSum[0] = 1
    var res = 0

    // Sum of elements so far.
    var currSum = 0
    for (element in nums) {

        // Add current element to sum so far.
        currSum += element
        //calculate the sum that have to be removed
        //so that we can get the desired sum
        val removeSum = currSum - k

        //get count of occurrences of that sum that
        //have to removed and add it to res value
        if (prevSum.containsKey(removeSum)) res += prevSum[removeSum]!!

        // Add currsum value to count of
        // different values of sum.
        prevSum[currSum] = prevSum.getOrDefault(currSum, 0)!! + 1
    }
    return res
}
