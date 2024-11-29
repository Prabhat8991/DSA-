package phase2.recursion.grind75

fun main() {
    var resultArr = arrayListOf<ArrayList<Int>>()
    var inputArray = arrayListOf<Int>(2,3,6,7)
    var tempArray = arrayListOf<Int>()
    var target = 7
    combinationSum(inputArray, target, resultArr, 0, tempArray)
    resultArr.forEach { println(it) }
}

fun combinationSum(arr: ArrayList<Int>, target: Int, resArray: ArrayList<ArrayList<Int>>, index: Int, tempArray: ArrayList<Int>) {
    println("Temp Array: $tempArray")
    if (index == arr.size) {
        if (target == 0) {
            println("Found solution $tempArray")
            resArray.add(ArrayList(tempArray))
        }
        return
    }
    if (arr[index] <= target) {
        tempArray.add(arr[index])
        combinationSum(arr, target - arr[index], resArray, index, tempArray)
        tempArray.removeAt(tempArray.size - 1)
    }
    combinationSum(arr, target, resArray, index + 1, tempArray)
}