package phase2.stack.leetcode.hard

import java.util.Stack

fun main() {
    println(largestRectangleArea(intArrayOf(1,4,3,1)))

    // 1 4 3 1
//   --> stack - 1  i = 0
    //stack - 0,1   i = 1
    //stack - 0,1 1-pop i = 2 area = 4*2 = 8
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