fun main() {
    val testArray = arrayOf<IntArray>(intArrayOf(1,5)) //[[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
    val newRangeArray = intArrayOf(2, 7)
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
   var resultArray = Array(intervals.size+1) { IntArray(0) }
   if (intervals.size == 0) {
       resultArray[0] = newInterval
       return resultArray
   }
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

    var mergedRangeLowerLimit = -1
    var mergedRangeUpperLimit = -1
    var mergedIndexStart = -1
    var mergedIndexEnd = -1

    for(i in intervals.indices) {
        if (newInterval[0] >= intervals[i][0] && newInterval[0] <= intervals[i][1]) {
            mergedRangeLowerLimit = intervals[i][0]
            mergedIndexStart = i
        }
        if (newInterval[1] >= intervals[i][0] && newInterval[1] <= intervals[i][1]) {
            mergedRangeUpperLimit = intervals[i][1]
            mergedIndexEnd = i;
        }

        if (newInterval[0] > intervals[i][1] && newInterval[0] < intervals[i+1][0]) {
            mergedRangeLowerLimit = newInterval[0]
            mergedIndexStart = i+1
        }

        if (newInterval[1] > intervals[i][1] && intervals.size > 1 && newInterval[1] < intervals[i+1][0]) {
            mergedRangeUpperLimit = newInterval[1]
            mergedIndexEnd = mergedIndexStart
        }

        if (newInterval[1] > intervals[i][1] && intervals.size > 0) {
            mergedRangeUpperLimit = newInterval[1]
            mergedIndexEnd = mergedIndexStart
        }
    }

    var resultCount = 0
    resultArray = Array(intervals.size - (mergedIndexEnd - mergedIndexStart)) { IntArray(0) }
    for(i in intervals.indices) {
        if (i < mergedIndexStart || i > mergedIndexEnd) {
            resultArray[resultCount] = intervals[i]
        }
        if (i == mergedIndexEnd && mergedIndexEnd != mergedIndexStart) {
            resultCount+=2
        }
        if (i == mergedIndexEnd && mergedIndexEnd == mergedIndexStart) {
            resultCount+=1
        }
    }
    resultArray[mergedIndexStart] = intArrayOf(mergedRangeLowerLimit, mergedRangeUpperLimit)

    return resultArray
}