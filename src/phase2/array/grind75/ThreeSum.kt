package phase2.array.grind75


fun main() {
    var input  = intArrayOf(-2,0,3,-1,4,0,3,4,1,1,1,-3,-5,4,0)
    var output = threeSum(input)
    output.forEach {
       println(it)
    }
}

fun threeSum(nums: IntArray): List<List<Int>> {
    var result: MutableList<List<Int>> = mutableListOf()
    var indexPointer: Int = 0
    var lowPointer: Int = 1
    var highPointer: Int = nums.size - 1
    var sum = Int.MIN_VALUE

    nums.sort()

    var lastLowPointerValue = nums[lowPointer]
    var lastHighPointerValue = nums[highPointer]

    var lastIndexPointerValue = nums[indexPointer]


    while (indexPointer < nums.size - 1) {

        if (indexPointer >= nums.size-2) {
            break
        }

        if (lowPointer >= highPointer) {
            indexPointer+=1
            if (lastIndexPointerValue == nums[indexPointer]) {
                continue
            } else {
                lowPointer = indexPointer + 1
                highPointer = nums.size - 1
                lastIndexPointerValue = nums[indexPointer]

                if (lowPointer == highPointer) {
                    break
                }
            }
            sum = Int.MIN_VALUE
        }

        if (sum != Int.MIN_VALUE && sum < 0 && lowPointer < nums.size && lastLowPointerValue == nums[lowPointer]) {
            lowPointer += 1
            continue
        }

        if (sum != Int.MIN_VALUE && sum > 0 && highPointer > -1 && lastHighPointerValue == nums[highPointer]) {
            highPointer -= 1
            continue
        }

        if (sum != Int.MIN_VALUE && sum == 0) {
            if (lowPointer < nums.size && lastLowPointerValue == nums[lowPointer]) {
                lowPointer += 1
                continue
            }

            if (highPointer > -1 && lastHighPointerValue == nums[highPointer]) {
                highPointer -= 1
                continue
            }
        }
        sum = nums[indexPointer] + nums[lowPointer] + nums[highPointer]

        if (sum == 0) {
            val resultSet = mutableListOf(nums[indexPointer], nums[lowPointer], nums[highPointer])
            result.add(resultSet)
            lastLowPointerValue = nums[lowPointer]
            lastHighPointerValue = nums[highPointer]
            lowPointer += 1
            highPointer -= 1
        } else if (sum < 0) {
            lastLowPointerValue = nums[lowPointer]
            lowPointer += 1
        } else if (sum > 0) {
            lastHighPointerValue = nums[highPointer]
            highPointer -= 1
        }
    }

    return result
}

