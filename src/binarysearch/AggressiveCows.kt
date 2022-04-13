package binarysearch

fun main () {
    var cowArray = intArrayOf(1, 2, 3)
    print(minimumLargestDistance(cowArray, 2))
}

fun minimumLargestDistance(intArray: IntArray, m: Int): Int {
    var start = 0
    var end = Int.MIN_VALUE

    intArray.forEach {
        if(it > end) {
            end = it
        }
    }

    intArray.sort()
    var mid = start + (end - start)/2
    var ans = 0
    while (start <= end) {

        if(isPossible(intArray, m, mid)) {
            ans = mid
            start = mid +1
        } else {
            end = mid -1
        }
        mid = start + (end - start)/2
    }
    return ans
}

fun isPossible(intArray: IntArray, m: Int, mid: Int): Boolean {
    var cowCount = 1
    var lastPosition = intArray[0]
    intArray.forEachIndexed { index, i ->
        if(i-lastPosition >= mid) {
            cowCount++
            if(cowCount == m) {
                return true
            }
            lastPosition = i
        }
    }
    return false
}