package phase2.array.grind75

import kotlin.math.min


fun main() {
  println(maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))
}

fun maxArea(height: IntArray): Int {
  var leftPointer = 0
    var rightPointer = height.size-1
    var maxArea = Int.MIN_VALUE

    while (leftPointer < rightPointer) {
        val area = min(height[leftPointer], height[rightPointer])*(rightPointer-leftPointer)
        if (area > maxArea) {
            maxArea = area
        }

        if (height[leftPointer] < height[rightPointer]) {
            leftPointer+=1
        } else if (height[leftPointer] > height[rightPointer]) {
            rightPointer-=1
        } else {
            leftPointer+=1
            rightPointer-=1
        }
    }
    return maxArea
}