package phase2.recursion

fun subSetCount(arr: ArrayList<Int>,k: Int, sum: Int): Int {
    if (k == 0) {
        return if (sum == 0) {
            1
        } else {
            0
        }
    }
    return subSetCount(arr, k-1, sum-arr[k-1]) + subSetCount(arr, k-1, sum)
}

fun main() {
    print(subSetCount(arrayListOf(1,2,3,4,5), 5, 8))
}