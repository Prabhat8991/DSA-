package phase1.recursion

fun main() {
  val inputArray = intArrayOf(6,5,4,3,2,1)
  mergeSort(inputArray, 0, 5)
  inputArray.forEach {
      print(it)
  }
}

fun mergeSort(arr: IntArray, start: Int, end: Int) {
    if (start >= end) {
        return
    }
    val mid = start + ((end - start) / 2)
    mergeSort(arr, start, mid)
    mergeSort(arr, mid + 1, end)
    merge(arr, start, end)
}

fun merge(arr: IntArray, start: Int, end: Int) {
    var left: Int = 0
    var right: Int = 0
    var mid = start + ((end - start) / 2)
    var resultCounter = start
    var arr1 = IntArray(mid - start + 1)
    var arr2 = IntArray(end - mid)
    for (i in arr1.indices) {
        arr1[i] = arr[start+i]
    }
    for (i in arr2.indices) {
        arr2[i] = arr[mid+1+i]
    }
    while (left < arr1.size && right < arr2.size) {
        if (arr1[left] < arr2[right]) {
            arr[resultCounter] = arr1[left]
            left++
            resultCounter++
        } else {
            arr[resultCounter] = arr2[right]
            right++
            resultCounter++
        }
    }
    if (left < arr1.size) {
        while (left < arr1.size) {
            arr[resultCounter] = arr1[left]
            left++
            resultCounter++
        }
    }

    if (right < arr2.size) {
        while (right < arr2.size) {
            arr[resultCounter] = arr2[right]
            right++
            resultCounter++
        }
    }
}