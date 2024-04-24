package phase2.array.grind75

fun main() {
  println(containsDuplicate(intArrayOf(1,2,3,3)))
}

fun containsDuplicate(nums: IntArray): Boolean {
  val set = mutableSetOf<Int>()
  nums.forEach {
      if (!set.add(it)) {
          return true
      }
  }
    return false
}