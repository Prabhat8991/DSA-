package revision

fun main(args: Array<String>) {
    var inputArray = arrayOf(1,1)
    for(i in 0..removeDuplicates(inputArray)) {
        print(inputArray[i])
    }
}

fun removeDuplicates(nums: Array<Int>): Int {
    var res = 0
    for(i in 1..nums.size-1) {
        res++
        if(nums[i] != nums[i-1]) {
            nums[res] = nums[i]
        }else if(nums[i-1] == nums[i]) {
            res--
        }

    }
    return  res
}

