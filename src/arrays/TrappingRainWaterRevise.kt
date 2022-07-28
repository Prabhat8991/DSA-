package arrays

fun main() {
   print(trap(intArrayOf(5,1,3,6,4,8)))
}

fun trap(height: IntArray): Int {
  //Create an array with elements max to the left of each element
    val leftMaxArray = IntArray(height.size)
    var leftMax = height[0]
    leftMaxArray[0] = 0
    for (i in 1 until height.size) {
        if (height[i] < leftMax) {
            leftMaxArray[i] = leftMax
        } else if(height[i] > height[i-1]) {
            leftMax = height[i]
            leftMaxArray[i] = 0
        }
    }

    //Create an array with elements max to the left of each element
    val rightMaxArray = IntArray(height.size)
    var rightMax = height[height.lastIndex]
    rightMaxArray[rightMaxArray.lastIndex] = 0
    for (i in height.size-2 downTo 0) {
        if (height[i] < rightMax) {
            rightMaxArray[i] = rightMax
        } else if(height[i] > rightMax) {
            rightMax = height[i]
            rightMaxArray[i] = 0
        }
    }

    //compare elements and find height of water
    var sum = 0
    var min = 0
    for (i in height.indices) {
        min = if (leftMaxArray[i] > rightMaxArray[i]) {
            rightMaxArray[i]
        } else {
            leftMaxArray[i]
        }
        if (height[i] < min) {
            sum+= min - height[i]
        }
    }
    return sum
}