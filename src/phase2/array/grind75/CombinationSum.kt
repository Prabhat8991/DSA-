package phase2.array.grind75

fun main() {
    var inputArray = intArrayOf(2,3,6,7)
    val target = 7
    combinationSum(inputArray, 7).forEach {
        println(it)
    }
}

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {

    val finalResult: MutableList<List<Int>> = mutableListOf()

    val temp: MutableList<Int> = mutableListOf()

    findCombination(candidates, target, temp, finalResult)

    return removeDuplicateLists(finalResult)

}

fun removeDuplicateLists(listsOfLists: List<List<Int>>): List<List<Int>> {
    val seen = HashSet<List<Int>>()
    val result = mutableListOf<List<Int>>()

    for (list in listsOfLists) {
        if (seen.add(list)) { // If the list is added to the set, it's not a duplicate
            result.add(list)
        }
    }

    return result
}

fun findCombination(candidates: IntArray, target: Int, temp: MutableList<Int>, finalResult: MutableList<List<Int>>) {
    if (target == 0) {
        temp.sort()
        finalResult.add(temp.toList())
        return
    }

    candidates.forEach {
        if (target - it >= 0) {
            temp.add(it)
            findCombination(candidates, target-it, temp, finalResult)
            temp.remove(it) //backtracking
        }
    }
}
