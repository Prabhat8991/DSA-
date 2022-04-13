package arrays

import revision.removeElement

fun main() {
  print(checkPossibility(intArrayOf(-1,4,2,3)))
}

fun checkPossibility(nums: IntArray): Boolean {
    var faultyIndex = 0
    var input = nums
    if (isNonDecreasing(nums)) {
        return true
    }
    for(i in 0..input.size-2) {
        if (input[0] > input[i+1]) {
            faultyIndex = 0
            break
        }
        if (input[i+1] < input[i]) {
            faultyIndex = i+1
            break
        }
    }

    //check after removing faulty
    input = input.filterIndexed { index, i ->
       index != faultyIndex
    }.toIntArray()

    if (isNonDecreasing(input)) {
        return true
    }
   return false
}

fun isNonDecreasing(nums: IntArray): Boolean {
    for (i in 0..nums.size-2) {
        if (nums[i+1] < nums[i]) {
            return false
        }
    }
    return true
}

