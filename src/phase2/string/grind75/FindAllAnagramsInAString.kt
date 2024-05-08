package phase2.string.grind75

fun main() {
  findAnagrams("abab", "ab").forEach {
      println(it)
  }
}

fun findAnagrams(s: String, p: String): List<Int> {

    if (s.length < p.length) {
        return emptyList()
    }

    var resultIndexList = mutableListOf<Int>()
   var inputIntArray = IntArray(26){0}
    p.forEach {
        inputIntArray[it - 'a'] = inputIntArray[it - 'a']+1
    }

    var testIntArray = IntArray(26){0}

    var trailingPointer = 0
    var leadingPointer = 0
    var windowSize = p.length
    var isValidAnagram = true
    var counter = 1
    var copyOfLeadingPointer = 0

    while (leadingPointer <= s.length) {
        if (leadingPointer - trailingPointer < windowSize) {
            if (leadingPointer < s.length) {
                testIntArray[s[leadingPointer] - 'a'] = testIntArray[s[leadingPointer] - 'a'] + 1
            }
            leadingPointer += 1
            continue
        }
        if (leadingPointer - trailingPointer == windowSize) {
            copyOfLeadingPointer = leadingPointer - counter
            if (testIntArray[s[copyOfLeadingPointer] - 'a'] != inputIntArray[s[copyOfLeadingPointer] - 'a']) {
                isValidAnagram = false
            }
            counter+=1
            if (copyOfLeadingPointer > trailingPointer)
                continue
        }

        if (isValidAnagram) {
            resultIndexList.add(trailingPointer)
        }
        trailingPointer+=1
        leadingPointer = trailingPointer
        isValidAnagram = true
        counter = 1
        testIntArray = IntArray(26){0}
        }
    return resultIndexList
}