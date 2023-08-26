package phase1.sort

fun main() {
    var intArray = intArrayOf(4,5,1,3,2)
    bubbleSort(intArray)
    intArray.forEach {
        print(it)
    }
}

fun bubbleSort(intArray: IntArray) {
    var shouldContinue = true
    var index = intArray.size-1
    while (shouldContinue) {
         shouldContinue = false
        for (i in 0 until index) {
          if(intArray[i] > intArray[i+1]) {
              shouldContinue = true
              intArray[i] = intArray[i] + intArray[i+1]
              intArray[i+1] = intArray[i] - intArray[i+1]
              intArray[i] = intArray[i] - intArray[i+1]
          }
        }
        index--
    }
}