package phase1.binarysearch

fun main() {
 var inputArr = intArrayOf(1,2,3,4,5)
    print(findPivotIndex(inputArr))
}

fun findPivotIndex(arr: IntArray): Int {
    var start = 0
    var end = arr.size-1
    var mid = start + (end - start)/2
        while (start < end) {
            if (arr[mid] >= arr[0]) {
                start = mid + 1
            } else {
                end = mid
            }
            mid = start + (end - start) / 2

        }
        return mid
    }
