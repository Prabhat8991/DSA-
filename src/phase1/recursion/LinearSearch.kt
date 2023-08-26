package phase1.recursion

fun main() {
    search(intArrayOf(1,2,3,4,5), 9, 0)
}

fun search(arr: IntArray, key: Int, index: Int = 0) {
    if (arr[index] == key) {
        print("Element Found")
        return
    }
    if (index == arr.size-1) {
        print("Element not Found")
        return
    }
    return search(arr, key, index+1)
}