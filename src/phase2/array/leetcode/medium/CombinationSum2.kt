package phase2.array.leetcode.medium

fun main() {
    print(combinationSum2(intArrayOf(10,1,2,7,6,1,5), 8))
}

fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
  var result: MutableList<List<Int>> = mutableListOf()
  var temp: MutableList<Int> = mutableListOf()
    candidates.sort()
    calculate(candidates, target, result, 0, temp)
    return result
}
fun calculate(candidates: IntArray, target: Int, result: MutableList<List<Int>>, index: Int, temp: MutableList<Int>) {
    if (target == 0) {
        temp.sort()
        result.add(temp.toList())
        return
    }

    for (i in index..candidates.size-1) {
        if (i > index && candidates[i] == candidates[i-1]) { // ensures that duplicate combinations are not produced
            continue
        }

        if (target - candidates[i] < 0) {
            break
        }

        if (target - candidates[i] >= 0) {
            temp.add(candidates[i])
            calculate(candidates, target - candidates[i], result, i + 1, temp) //i+1 ensure every element is taken only once
            temp.remove(candidates[i])
        }
    }

}