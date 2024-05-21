package phase2.hastable.leetcode.easy

fun main() {

}

fun findTheDifference(s: String, t: String): Char {
  var mapStringS = mutableMapOf<Char, Int>()
    var mapStringT = mutableMapOf<Char, Int>()

    s.forEach {
        mapStringS[it] = mapStringS[it]?.plus(1)?:1
    }

    t.forEach {
        mapStringT[it] = mapStringT[it]?.plus(1)?:1
    }

    mapStringT.forEach {
        if (mapStringS[it.key] != it.value) {
            return it.key
        }
    }
    return 'n'
}