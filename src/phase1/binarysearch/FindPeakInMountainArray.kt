package phase1.binarysearch

fun main() {
    var mountainArray = intArrayOf(1,2,3,4,5,3,2)
    print(findPeakInMountainArray(mountainArray))
}

fun findPeakInMountainArray(arr: IntArray): Int {
    var start = 0
    var end = arr.size -1
    var mid = start +(end  - start)/2

    while (start <= end) {

        if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
            return mid
        } else if(arr[mid] < arr[mid+1]) {
            start = mid
        } else if (arr[mid] > arr[mid+1]){
            end = mid
        }
        mid = start + (end - start)/2
    }
    return -1
}