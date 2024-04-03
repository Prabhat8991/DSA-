package phase2.array.grind75

fun main() {
    val testArray = arrayOf(3,2,4).toIntArray()
   twoSum(testArray, 6).forEach {
       println(it)
   }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
  val numMap = emptyMap<Int, Int>().toMutableMap()

   for(i in nums.indices) {
       numMap[nums[i]] = i
   }

   val output = mutableListOf<Int>()

   for(i in nums.indices) {
       val complimentaryDigit = target - nums[i]
       if (numMap.containsKey(complimentaryDigit) && numMap[complimentaryDigit] != i)  {
           output.add(i)
           output.add(numMap[complimentaryDigit]!!)
           break
       }
   }
    return output.toIntArray()
}