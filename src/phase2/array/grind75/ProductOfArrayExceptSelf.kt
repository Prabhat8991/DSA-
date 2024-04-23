package phase2.array.grind75

fun main() {
    productExceptSelf(intArrayOf(1, 2, 3, 4, 5)).forEach {
        print(it)
        println()
    }
}

fun productExceptSelf(nums: IntArray): IntArray {
    val resultArray = IntArray(nums.size) { 0 }
    val preFixProductArray = IntArray(nums.size) { 0 }
    val suffixProductArray = IntArray(nums.size) { 0 }
    var prefixProd = 1
    var suffixProd = 1
    preFixProductArray[0] = 1
    suffixProductArray[nums.size-1] = 1
    for (i in 1..nums.size - 1) {
        prefixProd *= nums[i - 1]
        preFixProductArray[i] = prefixProd
    }

    for (i in nums.size-2 downTo 0) {
        suffixProd*= nums[i+1]
        suffixProductArray[i] = suffixProd
    }

    for (i in nums.indices) {
        resultArray[i] = preFixProductArray[i] * suffixProductArray[i]
    }

    return resultArray
}