package arrays

fun main() {
    var array = intArrayOf(1,2,3,4,5,6)
    rotateArray(array, 2).forEach {
        print(it)
    }
}

fun rotateArray(intArray: IntArray, k: Int): IntArray {
    val tempArray = IntArray(intArray.size)

    for(i in intArray.indices) {
        tempArray[(i+k)%intArray.size] = intArray[i]
    }
  return tempArray
}