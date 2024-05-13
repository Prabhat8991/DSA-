package phase2.array.leetcode.easy

import kotlin.math.abs

fun main() {
  println(containsNearbyDuplicate(intArrayOf(1,2,3,4,5,6,7,8,9,9), 3))
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
   var windowSize = k
   var indexPointer = 0
   var leadingPointer = 1

   while (indexPointer < nums.size-1) {
      if (nums[indexPointer] == nums[leadingPointer]) {
         if(abs(leadingPointer - indexPointer) <= windowSize) {
            return true
         }
      }
      if (leadingPointer - indexPointer <= windowSize && leadingPointer < nums.size-1) {
       leadingPointer+=1
      } else {
       indexPointer+=1
       leadingPointer=indexPointer+1
      }
   }
  return false
}

