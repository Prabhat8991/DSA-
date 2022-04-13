package revision

fun main(args: Array<String>) {
    print(leftMostRepeatingChar("afbcdzef"))
}

fun leftMostRepeatingChar(inputStr: String): Char {
    val boolArray = BooleanArray(256)
    var leftMostChar = '0'
    for(char in inputStr) {
        if(boolArray[char.toInt()]) {
            leftMostChar = char
        } else {
            boolArray[char.toInt()] = true
        }
    }
    return leftMostChar
}