package dailytarget

/**
 * Date : 28/08/2021
 */

fun main() {
    val testArray = intArrayOf(1,2,3,4,5,6)
    reverseArray(testArray)
    testArray.map {
        print(it)
    }

}

fun reverseArray(array: IntArray) {
    var low: Int = 0
    var high: Int = array.size - 1

    while (high > low) {
        var temp = 0
        temp = array[low]
        array[low] = array[high]
        array[high] = temp

        low++;
        high--;
    }
}

