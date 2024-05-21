package phase2.bitwise.leetcode.medium

import kotlin.math.sin

fun main() {
   singleNumber(intArrayOf(1,1,2,2,3,5,6,6)).forEach {
       println(it)
   }
}

fun singleNumber(nums: IntArray): IntArray {
   var result = 0
    var resultArray = IntArray(2){0}
    nums.forEach {
        result = result xor it
    }

    var k = result and (result-1).inv()

    for (i in 0..nums.size-1) {
        if (nums[i] and  k != 0) {
            resultArray[0] = resultArray[0] xor nums[i]
        } else {
            resultArray[1] = resultArray[1] xor nums[i]
        }
    }

    return resultArray
}