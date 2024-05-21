package phase2.array.leetcode.easy

fun main() {
   print(isPossibleToSplit(intArrayOf(6,1,3,1,1,8,9,2)))
}

fun isPossibleToSplit(nums: IntArray): Boolean {
   var mapOfInt = mutableMapOf<Int, Int>()
    nums.forEach {
        mapOfInt[it] = mapOfInt[it]?.plus(1)?: 1
    }

    mapOfInt.forEach {
        if (it.value > 2) {
            return false
        }
    }
    return true
}