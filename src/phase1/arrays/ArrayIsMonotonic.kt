package phase1.arrays

fun main() {
  var input = intArrayOf(6,5,4,4)
    print(isMonotonic(input))
}

fun isMonotonic(nums: IntArray): Boolean {
    var decremental = true
    var incremental = true
   for (i in 0..nums.size-2) {
       if (nums[i] == nums[i+1]) {
           continue
       }
       if (nums[i] < nums[i+1]) {
           decremental = false
           if (!incremental) {
               break
           }
       } else if(nums[i] > nums[i+1]) {
           incremental = false
           if (!decremental) {
               break
           }
       }
   }
    return decremental || incremental
}