package recursion

fun main() {
    print(isPalindrome("abbabba", 0, 3))
}

fun test(): String {
    return "Prabhat".substring(0,2)
}

fun isPalindrome(str: String, start: Int, end: Int): Boolean {
    if (str.length == 1) return true
    if (str.isEmpty()) return true
    var endIndex = str.substring(start+1, end).length - 1
    return (str[start] == str[end]) && isPalindrome(str.substring(start+1, end), start, endIndex)
}
