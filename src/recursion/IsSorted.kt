package recursion

fun main() {
    print(isSorted(intArrayOf(1,2,3,4,5,6,4), 7, 0))
}

fun isSorted(arr: IntArray, size: Int, start: Int): Boolean {
    if (size == 1 || size == 0) {
        return true
    }
    if (arr[0] > arr[1]) {
        return false
    }
    return isSorted(arr.sliceArray(start until size), size-1, start)
}
