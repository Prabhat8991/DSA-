package phase2.hastable.grind75

fun main() {
    println(canConstruct("aa", "aab"))
}

fun canConstruct(ransomNote: String, magazine: String): Boolean {

    if (ransomNote.length > magazine.length) {
        return false
    }
  val ransomHashTable = mutableMapOf<Char, Int>()
    val magazineHashTable = mutableMapOf<Char, Int>()
    var result = true


    ransomNote.forEach {
        ransomHashTable[it] = ransomHashTable[it]?.plus(1)?: 0
    }

    magazine.forEach {
        magazineHashTable[it] = magazineHashTable[it]?.plus(1)?: 0
    }

    ransomHashTable.forEach {
        if (magazineHashTable[it.key] == null) {
            result = false
            return result
        }
        if (magazineHashTable[it.key]!! < it.value) {
            result = false
            return result
        }
    }

    return result
}