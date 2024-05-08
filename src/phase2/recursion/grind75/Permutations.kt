package phase2.recursion.grind75

fun main() {
 permute(intArrayOf(1,2,3)).forEach {
     println(it)
 }
}

fun permute(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    findPermutations(nums, 0, result)
    return result
}

fun findPermutations(nums: IntArray, position: Int, result: MutableList<List<Int>>) {
    if (position == nums.size-1) {
        result.add(nums.toList())
        return
    }
    for (i  in position..nums.size-1) {
        swapElements(nums, position, i)
        findPermutations(nums, position+1, result)
        swapElements(nums, position, i)
    }
}

fun swapElements(nums: IntArray, i: Int, j: Int) {
    var temp = nums[i]
    nums[i] = nums[j]
    nums[j] = temp
}