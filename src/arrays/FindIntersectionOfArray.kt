package arrays

/**
 * Arrays are in non-decreasing order
 * arr = {2,3,4,5,5,6}
 * brr = {3,5,6,7,8}
 */
fun main() {
    val arr = intArrayOf(2,3,4,5,5,6)
    val brr = intArrayOf(3,5,6,7,8)
    findIntersectionOfArraysOptimised(arr, brr).forEach {
        print(it)
    }
}
//non optimised
fun findIntersectionOfArrays(arr: IntArray, brr: IntArray): ArrayList<Int> {
    val resultArrayList = arrayListOf<Int>()
    for(i in arr.indices) {
        for(j in brr.indices) {
            if(arr[i] == brr[j]) {
                resultArrayList.add(arr[i])
                brr[j] = -1
                break
            }
        }
    }
    return resultArrayList
}

fun findIntersectionOfArraysOptimised(arr: IntArray, brr: IntArray): ArrayList<Int> {
    val resultArrayList = arrayListOf<Int>()
    var i: Int = 0
    var j: Int = 0
    while(i < arr.size && j < brr.size) {
        if(arr[i] < brr[j]) {
            i++
        } else if(arr[i] > brr[j]) {
            j++
        } else {
            resultArrayList.add(arr[i])
            i++
            j++
        }

    }
    return resultArrayList
}