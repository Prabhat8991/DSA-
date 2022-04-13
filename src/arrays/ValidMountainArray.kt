package arrays

fun main() {
  print(validMountainArray(intArrayOf(1,3,2)))
}

fun validMountainArray(arr: IntArray): Boolean {
    if (arr.size <3) {
        return false
    }
   var peakIndex = findPeakIndex(arr)
    if (peakIndex == arr.lastIndex || peakIndex == 0) {
        return false
    }
    for (i in 0 until peakIndex) {
        if (arr[i+1] <= arr[i]) {
            return false
        }
    }

    for (i in peakIndex until arr.lastIndex) {
        if (arr[i+1] >= arr[i]) {
            return false
        }
    }
   return true
}

fun findPeakIndex(arr: IntArray): Int {
    var result = Int.MIN_VALUE
    var index = 0
    for (i in arr.indices) {
        if (arr[i] > result) {
            result = arr[i]
            index = i
        }
    }
    return index
}