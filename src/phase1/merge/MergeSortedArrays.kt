package phase1.merge

fun main() {
    var arr1 = intArrayOf(1,3,5,7,9)
    var arr2 = intArrayOf(2,4,6)
    mergeSortedArrays(arr1, arr2).forEach {
        print(it)
    }
}

fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    var counter1 = 0
    var counter2 = 0
    var m = arr1.size
    var n = arr2.size
    var k = 0
    var resultArray = IntArray(m+n)
    while (counter1 < m && counter2  < n) {
        if(arr1[counter1] < arr2[counter2]) {
            resultArray[k++] = arr1[counter1++]
        } else {
            resultArray[k++] = arr2[counter2++]
        }
    }
    while (counter1 < m) {
        resultArray[k++] = arr1[counter1++]
    }

    while (counter2 < n) {
        resultArray[k++] = arr2[counter2++]
    }


    return resultArray
}