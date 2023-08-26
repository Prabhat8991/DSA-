package phase1.recursion

fun main() {
    print(findPeakIndex(intArrayOf(1,2,3,4,5,4,3,2,1), 0, 8))
}

fun findPeakIndex(arr:IntArray, start: Int, end: Int): Int {
    var start = start
    var end = end
    var mid = start + ((end-start)/2)
    if (start > end) {
        return -1
    }
    if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid]-1) {
        return mid
    }

    if (arr[mid] > arr[mid+1]) {
        end = mid
    } else {
        start = mid
    }

    return findPeakIndex(arr, end, start)
}