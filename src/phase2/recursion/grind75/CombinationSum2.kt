package phase2.recursion.grind75

fun main() {
  val arr = intArrayOf(1,1,1,2,2)
  arr.sort()
  var res = arrayListOf<ArrayList<Int>>()
  var target = 4
  var temp = arrayListOf<Int>()
    combinationSumTwo(arr, res, target, temp, 0)
    res.forEach { println(it) }
}

fun combinationSumTwo(arr: IntArray, res: ArrayList<ArrayList<Int>>, target: Int, temp: ArrayList<Int>, index: Int) {
    if (target == 0) {
        res.add(ArrayList(temp))
        return
    }

    for (i in index until arr.size) {
        if (i > index && arr[i] == arr[i-1]) continue //skipping same element at same position
        if (arr[i] > target) break
        temp.add(arr[i])
        combinationSumTwo(arr, res, target - arr[i], temp, i + 1) // increasing index so to avoid duplicate combinations
        temp.removeAt(temp.size - 1)
    }
}