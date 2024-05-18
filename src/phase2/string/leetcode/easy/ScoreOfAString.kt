package phase2.string.leetcode.easy

fun main() {

}

fun scoreOfString(s: String): Int {
    var sum = 0
    for (i in 0..s.length-2) {
       var tempSum = Math.abs(s[i] - s[i+1])
        sum+=tempSum
    }
    return sum
}