package phase1.revision

fun main(args: Array<String>) {
    val inputArray = intArrayOf(3,2,2,3)
    for(i in 0..removeElement(inputArray, 3)) {
        print(inputArray)
    }
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    var count = 0

    for(i in 0..nums.size-1) {
        while(nums[i] == `val`) {
            for(j in i..nums.size-2)
                nums[j] = nums[j+1]

            count++
        }

    }
    return nums.size - count+1
}