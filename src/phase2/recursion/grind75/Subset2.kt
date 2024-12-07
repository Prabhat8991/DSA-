package phase2.recursion.grind75

fun main() {
  val arr = intArrayOf(1,2,2)
  subsetsWithDup(arr)
}

fun subsetsWithDup(nums: IntArray): List<List<Int>> {
    var res = arrayListOf<ArrayList<Int>>()
    var temp = arrayListOf<Int>()
    subsetTwo(nums, res, temp, 0)
    res.forEach { print(it) }
    return res
}

fun subsetTwo(arr: IntArray, res: ArrayList<ArrayList<Int>>, temp: ArrayList<Int>, index: Int) {

    for (i in index until arr.size) {
        if (i > index && arr[i] == arr[i-1]) continue //skipping same element at same position to avoid duplicate combinations
        temp.add(arr[i])
        res.add(ArrayList(temp))
        subsetTwo(arr, res, temp, i + 1)
        temp.removeAt(temp.size - 1)
    }
}