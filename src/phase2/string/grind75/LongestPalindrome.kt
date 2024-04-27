package phase2.string.grind75

fun main() {
  println(longestPalindrome("bananas"))
}

fun longestPalindrome(s: String): Int {
    val frequencyMap = mutableMapOf<Char, Int>().withDefault { 0 }
    var shouldAddOne = false
    var totalLengthOfPalindrome = 0
    var isAllCharSame = true

    for (i in 1..s.length-1) {
        if (s[i] != s[i-1]) {
            isAllCharSame = false
        }
    }

    if (isAllCharSame) {
        return s.length
    }

    s.forEach {
        frequencyMap[it] = 0
    }

    s.forEach {
        frequencyMap[it] = frequencyMap[it]!! + 1
    }

    frequencyMap.forEach {
        if (it.value % 2 == 0) {
            totalLengthOfPalindrome+=it.value
        } else {
            totalLengthOfPalindrome+=(it.value-1)
            shouldAddOne = true
        }
    }

    if(shouldAddOne) {
        totalLengthOfPalindrome+=1
    }
    return totalLengthOfPalindrome
}

