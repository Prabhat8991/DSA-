package arrays

import kotlin.math.min

fun main() {
    print(maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))
}

/*
//Naive Approach 0(n2)
fun maxArea(height: IntArray): Int {
    var maxArea = 0

    for (i in height.indices) {
        for (j in i+1 until height.size) {
            val area = (j-i) * minOf(height[i], height[j])
            maxArea = maxOf(area, maxArea)
        }
    }
    return maxArea
}
*/

//Optimised solution O(n)
fun maxArea(height: IntArray): Int {
    var counterLeft = 0
    var counterRight = height.lastIndex

    var maxArea = minOf(height[counterLeft], height[counterRight])*(counterRight - counterLeft)

    while (counterLeft < counterRight) {
        var area = 0
        var areaAffected = false
        if(height[counterLeft] < height[counterRight]) {
            if (height[counterLeft + 1] > height[counterLeft]) {
                areaAffected = true
                counterLeft++
                area = minOf(height[counterLeft], height[counterRight])*(counterRight - counterLeft)
            }
        }
        else if(height[counterLeft] > height[counterRight]) {
            if (height[counterRight - 1] > height[counterRight]) {
                areaAffected = true
                counterRight--
                area = minOf(height[counterLeft], height[counterRight])*(counterRight - counterLeft)
            }
        } else if(height[counterLeft] == height[counterRight]) {
            if (height[counterLeft + 1] > height[counterLeft]) {
                areaAffected = true
                counterLeft++
                area = minOf(height[counterLeft], height[counterRight])*(counterRight - counterLeft)
            }
            if (height[counterRight - 1] > height[counterRight]) {
                areaAffected = true
                counterRight--
                area = minOf(height[counterLeft], height[counterRight])*(counterRight - counterLeft)
            }
        }
        if (!areaAffected) {
            when {
                height[counterLeft] < height[counterRight] -> {
                    counterLeft++
                }
                height[counterLeft] > height[counterRight] -> {
                    counterRight--
                }
                else -> {
                    counterLeft++
                    counterRight--
                }
            }
        }
        if (area > maxArea) {
            maxArea = area
        }
    }
    return maxArea
}

fun minOf(a: Int, b: Int): Int {
    return if (a < b) {
        a
    } else {
        b
    }
}

fun maxOf(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}