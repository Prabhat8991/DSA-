package phase1.string

fun main() {
    var inputString = "Prabhat"
    reverseString(charArray = inputString.toCharArray()).forEach {
        print(it)
    }
}

fun reverseString(charArray: CharArray): CharArray {
    var i = 0
    var j = charArray.size-1
    var temp: Char
    while (i < j) {
        temp = charArray[i]
        charArray[i] = charArray[j]
        charArray[j] = temp
        i++
        j--
    }
    return charArray
}