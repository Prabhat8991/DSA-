package phase2.string.leetcode.easy

fun main() {
println(lengthOfLastWord("The last word is \"joyboy\" with length 6"))
}

fun lengthOfLastWord(s: String): Int {
    var length = 0
    for(i in s.length-1 downTo 0) {
        if (length > 0 && s[i].isWhitespace()) {
            break
        }
        if(s[i].isLetter()) {
            length+=1
        }
    }
    return length
}