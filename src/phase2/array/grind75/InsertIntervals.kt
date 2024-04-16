fun main() {
    val testArray = arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(6, 7), intArrayOf(8, 10), intArrayOf(12, 16)) //[[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
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
    var sortedArray = Array<IntArray>(intervals.size + 1) { intArrayOf() }
    var index = 0
    while (index < intervals.size) {
        sortedArray[index] = intervals[index]
        index++
    }
    sortedArray[index] = newInterval

    sortedArray.sortBy { it[0] }

    var baseArrayPointer = 0
    var targetArrayPointer = 1

    while (baseArrayPointer < sortedArray.size && targetArrayPointer < sortedArray.size) {
        if (sortedArray[targetArrayPointer][0] <= sortedArray[baseArrayPointer][1]) {
            if (sortedArray[targetArrayPointer][1] >= sortedArray[baseArrayPointer][1]) {
                sortedArray[baseArrayPointer] = intArrayOf(sortedArray[baseArrayPointer][0], sortedArray[targetArrayPointer][1])
            } else {
                sortedArray[baseArrayPointer] = intArrayOf(sortedArray[baseArrayPointer][0], sortedArray[baseArrayPointer][1])
            }
        } else {
            sortedArray[baseArrayPointer] = sortedArray[baseArrayPointer]
            sortedArray[baseArrayPointer + 1] = sortedArray[targetArrayPointer]
            baseArrayPointer += 1
        }
        targetArrayPointer += 1
    }

    var resultArray = Array<IntArray>(baseArrayPointer + 1) { intArrayOf() }

    for (i in sortedArray.indices) {
        if (i > baseArrayPointer) {
            break;
        }
        resultArray[i] = sortedArray[i]
    }

    return resultArray
}