package phase1.arrays

fun main() {
 print(findShortestSubArray(intArrayOf(1,2,2,3,1,4)))
}

fun findShortestSubArray(nums: IntArray): Int {
    val map = mutableMapOf<Int, Triple<Int, Int, Int>>()
    var first = 0
    var last = 0
    var maxDegree = Integer.MIN_VALUE
    var degree = 0
    for (i in nums.indices) {
        degree = map[nums[i]]?.third?.plus(1)?:1
        if (degree > maxDegree) {
            maxDegree = degree
        }
        if (!map.containsKey(nums[i])) {
            first = i
            last = i
            map[nums[i]] = Triple(first, last, degree)
        } else {
            last = i
            map[nums[i]] = map[nums[i]]?.copy(third = degree, second = last)?: Triple(0,0,0)
        }
    }
    var shortestSubArray = Integer.MAX_VALUE
    map.forEach {
        if (it.value.third == maxDegree) {
            var subArraySize = it.value.second - it.value.first
            if (subArraySize < shortestSubArray) {
                shortestSubArray = subArraySize
            }
        }
    }

    return shortestSubArray+1
}
