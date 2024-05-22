package phase2.stack.leetcode.hard

import java.util.Stack

fun main() {
    println(maximalRectangle(arrayOf(charArrayOf('1', '1', '1', '1', '1', '1', '1', '1', '1', '1'), charArrayOf('1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),charArrayOf('1', '1', '1', '1', '1', '1', '1', '1', '1', '1'), charArrayOf('1', '1', '1', '1', '1', '1', '1', '1', '1', '1'), charArrayOf('1', '1', '1', '1', '1', '1', '1', '1', '1', '1'), charArrayOf('1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),charArrayOf('1', '1', '1', '1', '1', '1', '1', '1', '1', '1'), charArrayOf('1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),charArrayOf('1', '1', '1', '1', '1', '1', '1', '1', '1', '1'), charArrayOf('1', '1', '1', '1', '1', '1', '1', '1', '1', '1'))))
}

fun maximalRectangle(matrix: Array<CharArray>): Int {
    var finalResult = Int.MIN_VALUE
    var histogram: IntArray = IntArray(matrix[0].size)
    var prevHistogram: IntArray = IntArray(matrix[0].size)
    var intArray: Array<IntArray> = Array(matrix.size) { IntArray(matrix[0].size) }


    for (i in matrix.indices) {
        for(j in matrix[i].indices) {
            intArray[i][j] = matrix[i][j].toIntValue()
        }
    }


    for (i in intArray.indices) {
        for (j in intArray[i].indices) {
            if (i > 0) {
                if (intArray[i][j] == 0) {
                    histogram[j] = 0
                } else {
                    histogram[j] = prevHistogram[j] + intArray[i][j]
                }
            } else {
                histogram[j] = intArray[i][j]
            }
            prevHistogram = histogram
        }
        var area = largestRectangleInHistogram(histogram)
        if (area > finalResult) {
            finalResult = area
        }
    }
    return finalResult
}

fun largestRectangleInHistogram(charArray: IntArray): Int {
    var rectStack = Stack<Int>()

    var result = Int.MIN_VALUE

    for (i in charArray.indices) {
        while (rectStack.isNotEmpty() && charArray[rectStack.peek()] >= charArray[i]) {
            var top = rectStack.pop()
            var currentArea = if (rectStack.isEmpty()) {
                charArray[top] * i
            } else {
                charArray[top] * (i - rectStack.peek() - 1)
            }

            if (currentArea > result) {
                result = currentArea
            }
        }
        rectStack.push(i)

    }

    while (rectStack.isNotEmpty()) {
        var top = rectStack.pop()
        var currentArea = if (rectStack.isEmpty()) {
            charArray[top] * charArray.size
        } else {
            charArray[top] * (charArray.size - rectStack.peek() - 1)
        }
        if (currentArea > result) {
            result = currentArea
        }
    }
    return result
}

fun Char.toIntValue(): Int {
    if (this in '0'..'9') {
        return this - '0'
    } else {
        throw IllegalArgumentException("Char '$this' is not a digit")
    }
}