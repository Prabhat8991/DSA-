package phase2.string.grind75

fun main() {
  println(isPalindrome("ab_a"))
}

fun isPalindrome(s: String): Boolean {
    val sanitizedString: StringBuilder = StringBuilder()

    s.toLowerCase().forEach {
        val asciiValue: Int = it.toInt()
        if (asciiValue in 48..57 || asciiValue in 65..90 || asciiValue in 97..122) {
            sanitizedString.append(it)
        }
    }

    var leftPointer = 0
    var rightPointer = sanitizedString.length-1

    while (leftPointer < rightPointer) {
        if (sanitizedString[leftPointer] != sanitizedString[rightPointer]) {
            return false
        }
        leftPointer++
        rightPointer--
    }

    return true
}