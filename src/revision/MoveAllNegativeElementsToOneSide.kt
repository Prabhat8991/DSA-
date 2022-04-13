package revision

fun main(args: Array<String>) {
    val intArray = intArrayOf(1,-1,0,-2,3,-4)
    moveAllNegativeElementsToOneSide(intArray)
    for(i in intArray) {
        print(i)
    }
}

fun moveAllNegativeElementsToOneSide(intArray: IntArray) {
    var count = 0
    for(i in intArray.indices) {
        if(intArray[i] >= 0) {
            var temp = intArray[count]
            intArray[count] = intArray[i]
            intArray[i] = temp
            count++
        }
    }
}