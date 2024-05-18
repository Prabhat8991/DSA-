package phase2.array.leetcode.easy

fun main() {
    intersect(intArrayOf(3,1,2), intArrayOf(1,1)).forEach { println(it) }
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
  var map: MutableMap<Int, Int> = mutableMapOf()
  var result: MutableList<Int> = mutableListOf()
  var mapArray = if (nums1.size > nums2.size)  {
      nums1
  } else {
      nums2
  }
  var verifyArray =   if (nums1.size > nums2.size)  {
      nums2
  } else {
      nums1
  }

    mapArray.forEach {
      map[it] = map[it]?.plus(1)?:1
  }
    verifyArray.forEach {
        if (map.contains(it) && map[it]!=null && map[it]!! > 0) {
            result.add(it)
            map[it] = map[it]?.minus(1)?:0
        }
    }
    return result.toIntArray()
}