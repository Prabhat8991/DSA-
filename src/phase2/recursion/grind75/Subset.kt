package phase2.recursion.grind75

fun main() {
    subsets(intArrayOf(1,2,3)).forEach {
        println(it)
    }
}

fun subsets(nums: IntArray): List<List<Int>> {
  var result: MutableList<List<Int>> = mutableListOf()
  var tempList: MutableList<Int> = mutableListOf()
    findSubsets(nums, -1, result, tempList)
    return result
}

fun findSubsets(nums: IntArray, index: Int, result: MutableList<List<Int>>, tempList: MutableList<Int>) {

    if (index == nums.size-1) {
        result.add(tempList.toList())
        return
    }

    findSubsets(nums, index+1, result, tempList.also { tempList.add(nums[index+1]) })
    tempList.removeAt(tempList.size-1)
    findSubsets(nums, index+1, result, tempList)
}