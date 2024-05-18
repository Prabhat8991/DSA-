fun main() {
    print(reverseVowels("hello"))
}

fun reverseVowels(s: String): String {
  var startPointer = 0
  var endPointer = s.length-1
  var stringArray = s.toCharArray()
  while (startPointer < endPointer) {
      if (stringArray[startPointer].isAVowel() && stringArray[endPointer].isAVowel()) {
          var temp = s[startPointer]
          stringArray[startPointer] = s[endPointer]
          stringArray[endPointer] = temp
          startPointer+=1
          endPointer-=1
      } else if (stringArray[startPointer].isAVowel()) {
          endPointer-=1
      } else if (stringArray[endPointer].isAVowel()) {
          startPointer+=1
      } else {
          endPointer-=1
          startPointer+=1
      }
  }
    val result = StringBuilder()
    stringArray.forEach {
        result.append(it)
    }
    return result.toString()
}

fun Char.isAVowel(): Boolean {
    return this == 'a' || this == 'e' || this == 'i' || this == 'o' || this == 'u' || this == 'A' || this == 'E' || this == 'I' || this == 'O' || this == 'U'
}