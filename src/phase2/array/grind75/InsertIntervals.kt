fun main() {
    val testArray = arrayOf<IntArray>(intArrayOf(1,2), intArrayOf(3,5), intArrayOf(6,7), intArrayOf(8,10), intArrayOf(12,16)) //[[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
    val newRangeArray = intArrayOf(4, 8)
    val result = insert(testArray, newRangeArray)
    for (i in result.indices) {
        print(" ")
        for (j in result[i].indices) {
            print(result[i][j])
            print(",")
        }

    }
}
fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
   //case1: when new interval lower limit is greater than last element upper limit
   val resultArray = Array(intervals.size+1) { IntArray(0) }
   if (newInterval[0] > intervals[intervals.size-1][1]) {
       for (i in intervals.indices) {
           resultArray[i] = intervals[i]
       }
       resultArray[intervals.size] = newInterval
       return resultArray
   }

    //case2: when need to merge
        //1. If new lower limit falls in input array range then take the range's lower limit as merged array lower limit
        //2. If new upper limit falls in input array range then take the range's upper limit as merged array upper limit
        //3. If new lower limit doesnt fall in any range before being surpassed by any input range then itself becomes lower limit
        //4. If new upper limit doesnt fall in any range before being surpassed by any input range then itself becomes upper limit
        //5. Get indices of the valid case here and then fill the result


    return resultArray
}