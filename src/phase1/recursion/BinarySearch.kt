package phase1.recursion

fun main() {
    print(binSearch(intArrayOf(1,2,3,4,5), 6, 0, 4))
}

fun binSearch(arr: IntArray,key: Int, start: Int, end: Int): Int {
    var start = start
    var end = end
    if (start > end) {
        return -1
    }
    var mid = start + ((end-start))/2
    if (arr[mid] == key) {
        return mid
    }
    if (arr[mid] < key) {
        start = mid+1
    } else {
        end =  mid - 1
    }
    return binSearch(arr, key, start, end)
}