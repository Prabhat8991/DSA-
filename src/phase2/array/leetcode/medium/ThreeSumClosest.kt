package phase2.array.leetcode.medium

fun main() {
  println(threeSumClosest(intArrayOf(-1000,-5,-5,-5,-5,-5,-5,-1,-1,-1), -14))
}

fun threeSumClosest(nums: IntArray, target: Int): Int {
    var indexPointer = 0
    var startPointer = 1
    var endPointer = nums.size - 1
    var result = Int.MIN_VALUE
    var diffResult = Int.MAX_VALUE


    nums.sort()
    while (indexPointer < nums.size-2) {
        while (startPointer < endPointer) {
            var sum = nums[indexPointer] + nums[startPointer] + nums[endPointer]
            var diff = Math.abs(target - sum)
            if (diff < diffResult) {
                diffResult = diff
                result = sum
            }

            if (startPointer == nums.size-2) {
                break
            }
            if (sum < target) {
                if (startPointer < endPointer && nums[startPointer + 1] != nums[startPointer]) {
                    startPointer += 1
                    continue
                }
                while (startPointer< endPointer && nums[startPointer + 1] == nums[startPointer]) {
                    startPointer += 1
                }
            } else {
                if (endPointer > startPointer && nums[endPointer - 1] != nums[endPointer]) {
                    endPointer -= 1
                    continue
                }
                while (endPointer > startPointer && nums[endPointer - 1] == nums[endPointer]) {
                    endPointer -= 1
                }
            }
        }
        indexPointer+=1
        startPointer = indexPointer+1
        endPointer = nums.size-1
    }
    return result
}