package phase2.array.leetcode.easy

fun main() {
    intersection(intArrayOf(1,2,2,1), intArrayOf(2,2)).forEach { println(it) }
}

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
  var set: MutableSet<Int> = mutableSetOf()
  var result: MutableList<Int> = mutableListOf()

  nums1.forEach {
      set.add(it)
  }
    nums2.forEach {
        if (set.contains(it) && !result.contains(it)) {
            result.add(it)
        }
    }
    return result.toIntArray()
}