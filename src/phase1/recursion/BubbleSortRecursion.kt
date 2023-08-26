package phase1.recursion

fun main() {
    var arr = intArrayOf(2,3,1,5,8,4)
    bubbleSort(arr, 6)
    arr.forEach {
        print(it)
    }
}

fun bubbleSort(arr: IntArray, size: Int) {
    if (size <= 1) {
        return
    }

    //solve one time
    for (i in 1 until arr.size) {
        if (arr[i-1] > arr[i]) {
            var temp = arr[i]
            arr[i] = arr[i-1]
            arr[i-1] = temp
        }
    }
    return bubbleSort(arr, size-1)
}
