package phase2.hastable.leetcode.easy

fun main() {

}

fun numJewelsInStones(jewels: String, stones: String): Int {
  var stoneMap = mutableMapOf<Char, Int>()
    var result = 0
    stones.forEach {
        stoneMap[it] = stoneMap[it]?.plus(1)?:1
    }

    jewels.forEach {
        if (stoneMap.containsKey(it)) {
            result = result  + stoneMap[it]!!
        }
    }
    return result
}