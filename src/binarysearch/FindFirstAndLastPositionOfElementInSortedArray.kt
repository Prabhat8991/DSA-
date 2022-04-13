package binarysearch

fun main() {
    var  input = intArrayOf(6)
    print(findFirstOccurence(input, 6))
    print(findLastOccurence(input, 6))

}

fun findFirstOccurence(arr: IntArray, key: Int): Int {
    var start = 0
    var end = arr.size -1
    var mid = start + (end - start)/2
    var ans: Int = -1

    while (start <= end) {
        if(arr[mid] == key) {
            ans = mid
            end = mid - 1
        } else if(key > arr[mid]) {
            start = mid + 1
        } else {
            end = mid - 1
        }
        mid = start + (end - start)/2
    }
    return ans
}

fun findLastOccurence(arr: IntArray, key: Int): Int {
    var start = 0
    var end = arr.size-1
    var mid = start + (end - start)/2
    var ans: Int = -1

    while (start <= end) {
        if(arr[mid] == key) {
            ans = mid
            start = mid + 1
        } else if(key > arr[mid]) {
            start = mid +1
        } else {
            end = mid - 1
        }
        mid = start + (end - start)/2
    }
    return ans
}