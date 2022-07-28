package arrays

fun main() {
 print(findMaxLength(intArrayOf(0,1)))
}

fun findMaxLength(nums: IntArray): Int {
    var simpleArray = IntArray(nums.size)
    var sum = 0
    var maxSubArray = 0
    var map = mutableMapOf<Int, Int>()
    nums.forEachIndexed { index, i ->
        if (i == 0) {
            simpleArray[index] = -1
        }  else {
            simpleArray[index] = 1
        }
    }
    simpleArray.forEachIndexed { index, i ->
        sum += i
        if (sum ==  0) {
            if (index > maxSubArray) {
                maxSubArray = index+1
            }
        }
        else if (map.containsKey(sum)) {
            val indexDiff = index - map[sum]!!
            if (indexDiff > maxSubArray) {
                maxSubArray = indexDiff
            }
        } else {
            map[sum] = index
        }

    }

    return maxSubArray
}