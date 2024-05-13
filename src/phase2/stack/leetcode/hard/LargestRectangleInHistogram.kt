package phase2.stack.leetcode.hard

import java.util.Stack

fun main() {
    println(largestRectangleArea(intArrayOf(2,1,5,6,2,3)))
}

fun largestRectangleArea(heights: IntArray): Int {
    var result =  Int.MIN_VALUE
    var stack = Stack<Int>()
    for (i in heights.indices) {
        while (!stack.isEmpty() && heights[stack.peek()] >= heights[i] ) {
            var top = stack.pop()
            var currentArea = if (stack.isEmpty()) {
                heights[top]*i
            } else {
                heights[top]*(i-stack.peek()-1)
            }
            if (currentArea > result) {
                result = currentArea
            }
        }
        stack.push(i)
    }

    while (!stack.isEmpty()) {
        var top = stack.pop()
        var currentArea = if (stack.isEmpty()) {
            heights[top]*heights.size
        } else {
            heights[top]*(heights.size - stack.peek() - 1)
        }
        if (currentArea > result) {
            result = currentArea
        }
    }
    return result
}