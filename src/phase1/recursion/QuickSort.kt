package phase1.recursion

fun main() {
  var input = intArrayOf(5,1,1,2,0,0)
    quickSort(input, 0, 5)
    input.forEach {
        print(it)
    }
}

fun quickSort(arr: IntArray, start: Int, end: Int) {
    if (start >= end) {
        return
    }

    val index = partition(arr, start, end)
    quickSort(arr, start, index-1)
    quickSort(arr, index + 1, end)
}

fun partition(arr: IntArray, start: Int, end: Int): Int {
    val pivot = arr[start]
    var cnt = 0
    for (i in start+1..end) {
        if (arr[i] <= pivot) {
            cnt++
        }
    }
    var pivotIndex = start + cnt
    var temp = arr[pivotIndex]
    arr[pivotIndex] = pivot
    arr[start] = temp

    var counterLeft = start
    var counterRight = end
    while (counterLeft < pivotIndex && counterRight > pivotIndex) {
        while (arr[counterLeft] <= pivot) {
            counterLeft++
        }
        while (arr[counterRight] >  pivot) {
            counterRight--
        }
        if (counterLeft < pivotIndex && counterRight > pivotIndex) {
            val temporary = arr[counterRight]
            arr[counterRight] = arr[counterLeft]
            arr[counterLeft] = temporary
            counterLeft++
            counterRight--
        }
    }
    return pivotIndex
}
