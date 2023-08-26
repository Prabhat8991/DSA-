package phase1.revision

fun main(args: Array<String>) {
print(findKthLargest(intArrayOf(2,1), 2))
}

fun findKthLargest(intArray: IntArray, k: Int): Int {
    var count = 0
    var largestElementInArray = Int.MIN_VALUE
    val largestElementInArrayCount = findLargest(intArray)
    for (i in intArray) {
        if(i >= largestElementInArray) {
            largestElementInArray = i
            count++
        }
        if(count == largestElementInArrayCount-(k-1)) {
            return i
        }
    }
    return 0
}

fun findLargest(intArray: IntArray): Int {
    var count = 0
    var largestElementInArray = Int.MIN_VALUE
    for(i in intArray) {
        if(i >= largestElementInArray) {
            largestElementInArray = i
            count++
        }
    }
    return count
}