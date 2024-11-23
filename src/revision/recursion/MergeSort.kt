package revision.recursion

fun main() {
    var arr = intArrayOf(5,4,3,2,1)
    mergeSort(arr, 0, 4)
    arr.forEach {
        println(it)
    }
}

fun mergeSort(arr: IntArray, start: Int, end: Int) {
    if (start == end) {
        return
    }
    val mid = (start + end)/2
    mergeSort(arr, start, mid)
    mergeSort(arr, mid+1, end)
    merge(arr, start, mid, end)
}

fun merge(arr: IntArray, start: Int, mid: Int, end: Int) {
    val temp = arrayListOf<Int>()
    var left = start
    var right = mid + 1
    while (left <= mid && right <= end) {
        if (arr[left] < arr[right]) {
            temp.add(arr[left])
            left++
        } else {
            temp.add(arr[right])
            right++
        }
    }

    if (left <= mid) {
        while (left <= mid) {
            temp.add(arr[left])
            left++
        }
    }

    if (right <= end) {
        while (right <= end) {
            temp.add(arr[right])
            right++
        }
    }

    for (i in start..end) {
        arr[i] = temp[i - start]
    }
}