package phase1.sort

fun main() {
    var intArray = intArrayOf(-1,2,-8,-10)
    selectionSort(intArray)
    intArray.forEach {
        print(it)
    }
}

fun selectionSort(intArray: IntArray) {
   for(i in 0..intArray.size-2) {
       var minIndex = i
       for (j in i+1 until intArray.size) {
           if(intArray[j] < intArray[minIndex]) {
               minIndex = j
           }
       }
       val temp = intArray[i]
       intArray[i] = intArray[minIndex]
       intArray[minIndex] = temp
   }
}