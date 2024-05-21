package phase2.hastable.leetcode.easy

fun main() {

}

fun firstUniqChar(s: String): Int {
   var resultMap = mutableMapOf<Char, Pair<Int, Int>>()
   for (i in 0..s.length-1) {
       resultMap[s[i]] = Pair(i, resultMap[s[i]]?.second?.plus(1)?: 1)
   }

    resultMap.forEach {
        if (it.value.second == 1) {
            return it.value.first
        }
    }

    return -1
}