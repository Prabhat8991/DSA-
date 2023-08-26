package phase1.recursion

fun main() {
    print(checkPalindrome("ABCBA", 0, 4))
}

fun checkPalindrome(str: String, start: Int, end: Int): Boolean {
    var start = start
    var end = end
    if (start > end) {
        return true
    }
    if (str.toCharArray()[start] != str.toCharArray()[end]){
        return false
    }

    return checkPalindrome(str, ++start, --end)
}