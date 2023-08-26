package phase1.revision

fun main() {
  val nums = intArrayOf(1,0,1,1,1,1,0,2,2,1,0,0,0,1,2,2,1,2,1,0,0,2,2,2,0,1,2,0,1,2,2,2,2,0,2,2,2,2,1,2,1,0,0,2,1,0,1,0,0,0,1,1,0,1,1)
    sortColors(nums)
    nums.forEach {
        print(it)
    }
}
fun sortColors(nums: IntArray): Unit {
    var startPointer = 0
    var endPointer = nums.size - 1

    //move 2 to be right
    while (startPointer < endPointer) {
        if (nums[endPointer] == 2) {
            endPointer--
            startPointer--

        }else if (nums[startPointer] == 2) {
            nums[startPointer] = nums[endPointer]
            nums[endPointer] = 2
            endPointer--
        }
        startPointer++
    }
    //move 1 to the right
    startPointer = 0
    while (startPointer < endPointer) {
        if (nums[endPointer] == 1 || nums[endPointer] == 2) {
            endPointer--
            startPointer--
        }else if (nums[startPointer] == 1 && nums[endPointer] != 2) {
            nums[startPointer] = nums[endPointer]
            nums[endPointer] = 1
        }
        startPointer++
    }

}


