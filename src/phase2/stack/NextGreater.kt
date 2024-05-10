package phase2.stack

import java.util.Stack

fun main() {
    nextGreaterElement(intArrayOf(4,1,2), intArrayOf(1,4,3,2)).forEach {
        println(it)
    }
}

fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
  var mapOfGreaterElements = mutableMapOf<Int, Int>()
    var stackOfGreaterElement = Stack<Int>()

    for(i in nums2.size-1 downTo 0 ) {
        if (i  == nums2.size-1 ) {
            stackOfGreaterElement.push(nums2[i])
            mapOfGreaterElements[nums2[i]] = -1
            continue
        }

        while (stackOfGreaterElement.isNotEmpty() && stackOfGreaterElement.peek() <= nums2[i]) {
            stackOfGreaterElement.pop()
        }

        if (stackOfGreaterElement.isEmpty()) {
            mapOfGreaterElements[nums2[i]] = -1
        } else {
            mapOfGreaterElements[nums2[i]] = stackOfGreaterElement.peek()
        }
        stackOfGreaterElement.push(nums2[i])
    }

    var resultArray = IntArray(nums1.size)

    for (i in nums1.indices) {
        resultArray[i] = mapOfGreaterElements[nums1[i]]!!
    }
    return resultArray
}