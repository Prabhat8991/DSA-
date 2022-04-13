package TwoPointers

fun main () {
    var array = intArrayOf(0,0,1,0,2,0)
    moveZeroesToRight(array)
    array.forEach {
        print(it)
    }
}

fun moveZeroesToRight(intArray: IntArray) {
    var left = 0
    var right = left + 1
    var m = intArray.size

    while (left <= right && left < m && right < m) {
        if(intArray[left] != 0) {
            left++
        }
        if(intArray[right] != 0 ) {
            intArray[right] = intArray[left] + intArray[right]
            intArray[left] = intArray[right] - intArray[left]
            intArray[right] = intArray[right] - intArray[left]
            left++
        } else {
            right++
        }
    }

}