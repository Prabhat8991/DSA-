package string

fun main() {
    print(findMaxOccuringChar("testsample"))
}

fun findMaxOccuringChar(str: String): Char {
    val intArray = IntArray(26)
    var max = Integer.MIN_VALUE
    var charIndex = 0
    str.forEach {
        intArray[it - 'a']++
    }

    intArray.forEachIndexed { index, i ->
        if(i > max) {
            max = i
            charIndex = index
        }
    }
    return 'a'+charIndex
}