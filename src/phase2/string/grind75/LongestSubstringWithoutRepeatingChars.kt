package phase2.string.grind75

fun main() {
   println(lengthOfLongestSubstring("abcabcbb"))
}

fun lengthOfLongestSubstring(s: String): Int {
  var pointer = 1
  var longestSubstring = Int.MIN_VALUE
    var charMap = mutableMapOf<Char, Int>()
    var substringStartIndex = 0
    var substringLength = 0
    if (s.isEmpty()) {
        return 0
    }
    charMap[s[0]] = 0

    var isAllCharSame = true

    for (i in 1..s.length-1) {
        if (s[i] != s[i-1]) {
            isAllCharSame = false
        }
    }
    if (isAllCharSame) {
        return 1
    }

    while (pointer < s.length) {
       if (!(charMap.containsKey(s[pointer]) && charMap[s[pointer]]!! >= substringStartIndex)) {
           substringLength = pointer - substringStartIndex +1
           if (longestSubstring < substringLength) {
               longestSubstring = substringLength
           }
       } else {
           substringStartIndex = (charMap[s[pointer]] as Int) + 1
           charMap.remove(s[pointer])
       }
        charMap[s[pointer]] = pointer

        pointer += 1
    }
    return longestSubstring
}