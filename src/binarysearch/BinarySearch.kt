package binarysearch

fun main() {
    val input = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    print(binarySearch(input, 10, 9))
}

fun binarySearch(arr: IntArray, size: Int, key: Int): Int {
    var start = 0
    var end = size - 1
    var mid = start + (end - start)/2

    while(start <= end) {
        if(arr[mid] == key) {
            return mid
        }
        if(arr[mid] < key) {
            start = mid + 1
        }
        if(arr[mid] > key) {
            end = mid - 1
        }
        mid = start + (end - start)/2
    }
    return -1
}