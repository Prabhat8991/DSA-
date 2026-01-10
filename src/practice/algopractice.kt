package practice

fun main() {
//   var array = intArrayOf(1, 0, 1, 0, 1, 0)
//    shiftZeroesToEnd(array)
//    array.forEach { print(it) }

    var arr = intArrayOf(7,1,5,3,6,4)
    println(maxStockProfit(arr))
}

fun shiftZeroesToEnd(array: IntArray) {
    var leftPointer = 0 // 1
    var rightPointer = array.size -1 // 0
  while (leftPointer <= rightPointer) {
      if (array[rightPointer] == 1 && array[leftPointer] == 0) {
          var temp = array[rightPointer]
          array[rightPointer] = array[leftPointer]
          array[leftPointer] = temp
          leftPointer++
          rightPointer--
          continue
      }

      if (array[rightPointer] == 0) {
          rightPointer--
      }

      if (array[leftPointer] == 1) {
          leftPointer++
      }
  }
}
fun maxStockProfit(array: IntArray): Int {
    var maxProfit = 0
    for (i in 0..array.size-2) {
        if (array[i] < array[i+1]) {
            maxProfit = maxProfit + array[i+1] - array[i]
        }
    }
    return maxProfit
}
