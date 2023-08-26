package phase1.arrays

fun main() {
    sortArrayByParity(intArrayOf(1,1,1,2,2,2,3,3,3,4,4,4)).forEach {
        print(it)
    }
}

fun sortArrayByParity(nums: IntArray): IntArray {
    var counterEven = 0
    var counterOdd = nums.size-1
    var temp = 0

    while (counterEven < counterOdd) {
        if (nums[counterEven] % 2 == 0) {
            counterEven++
        }
        if (nums[counterOdd] % 2 != 0) {
            counterOdd--
        }

        if ((counterEven < counterOdd) && nums[counterEven] % 2 != 0 && nums[counterOdd] % 2 == 0) {
            temp = nums[counterEven]
            nums[counterEven] = nums[counterOdd]
            nums[counterOdd] = temp
            counterEven++
            counterOdd--
        }
    }
    return nums
}


