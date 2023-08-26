package phase1.string

fun main(args: Array<String>) {
   var inputString = "He is boy"
   print(reverseWordsInString(inputString))
}

//Reverse each word
//Reverse whole phase1.string
fun reverseWordsInString(inputString: String): String {
    var startIndex = 0
    var endIndex = 0
    var resultString = inputString
    for(i in inputString.indices) {
      if(inputString[i].toInt() == 32 || i == inputString.length-1) {
          endIndex = if(i == inputString.length-1) {
              i
          } else {
              i - 1
          }
          resultString = reverseString(startIndex, endIndex, resultString.toCharArray())
          startIndex = i + 1
      }
    }
    return reverseString(0, resultString.length-1, resultString.toCharArray())
}

fun reverseString(startIndex: Int, endIndex: Int, inputString: CharArray): String {
    var i = startIndex
    var j = endIndex
    var temp: Char
    while(i < j) {
        temp = inputString[i]
        inputString[i]= inputString[j]
        inputString[j]= temp
        i++
        j--
    }
    return String(inputString)
}