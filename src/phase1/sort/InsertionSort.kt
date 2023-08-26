package phase1.sort

fun main() {
   val array = intArrayOf(2,3,1,5,8)
    insertionSort(array)
    for (i in array) {
        print(i)
    }
}

fun insertionSort(intArray: IntArray) {
   for(i in 1 until intArray.size) {
       var temp = intArray[i]
       var j = i-1
       while (j>=0 && intArray[j] > temp) {
           intArray[j+1] = intArray[j]
            j -= 1
       }
       intArray[j+1] = temp
   }
}