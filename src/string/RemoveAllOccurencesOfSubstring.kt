package string

fun main() {
    print(removeOccurrences("aabababa", "aba"))
}

fun removeOccurrences(s: String, part: String): String {
    var inputString = s
    while (inputString.isNotEmpty() && inputString.indexOf(part) != -1) {
        inputString = inputString.replaceFirst(part, "")
    }
    return inputString
}