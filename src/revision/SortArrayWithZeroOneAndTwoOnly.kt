package revision

fun main(args: Array<String>) {
    var intArray = intArrayOf(1,0,2,0,0,1)
    sortArrayWithOnlyZeroOneAndTwo(intArray)
    for (i in intArray) {
        print(i)
    }
}

fun sortArrayWithOnlyZeroOneAndTwo(intArray: IntArray) {
    shiftElementToRight(intArray, 2)
    shiftElementToRight(intArray, 1)
    shiftElementToRight(intArray, 0)
}

fun shiftElementToRight(intArray: IntArray, k: Int) {
    var count = 0
    for(i in intArray.indices) {
        if(intArray[i] != k && k > intArray[i]) {
            var temp = intArray[count]
            intArray[count] = intArray[i]
            intArray[i] = temp
            count++
        }
    }
}