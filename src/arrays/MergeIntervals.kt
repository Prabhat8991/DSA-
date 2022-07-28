package arrays

fun main () {
   var input = arrayOf(intArrayOf(1,4), intArrayOf(0,4))
    merge(input)
    merge(input).forEach {
        it.forEach {inner ->
            print("$inner  ")
        }
        println()
    }
}


fun merge(intervals: Array<IntArray>): Array<IntArray> {
  var sortedIntervals = intervals.sortedBy { it[0] }
  var tempArray = sortedIntervals[0]
  var resultArray = arrayListOf<IntArray>()
    if(intervals.size == 1) {
        resultArray.add(sortedIntervals[0])
    }
  for(i in 1 until sortedIntervals.size)  {
      if (tempArray[1] >= sortedIntervals[i][0]) {
          tempArray[1] = maxOf(sortedIntervals[i][1], tempArray[1])
      } else {
          resultArray.add(tempArray)
          tempArray = sortedIntervals[i]
      }
      if(i == intervals.lastIndex) {
          resultArray.add(tempArray)
      }
  }
    return resultArray.toTypedArray()
}