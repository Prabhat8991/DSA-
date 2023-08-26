package phase1.revision

fun main(args: Array<String>) {
   print(isAnagram("rat", "car"))
}

fun isAnagram(t: String, c: String): Boolean {
    val intArray = IntArray(246)

    if(t.length != c.length) {
        return false
    }
    for(i in t.indices) {
        intArray[t.toCharArray()[i].toInt()]++
        intArray[c.toCharArray()[i].toInt()]--
    }

    for(i in intArray) {
        if(i != 0) {
            return false
        }
    }
    return true
}