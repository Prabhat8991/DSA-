package phase2.bitwise.leetcode.easy

fun main() {
    println(hammingWeight(5))
}

fun hammingWeight(n: Int): Int {
    var count = 0
    var number = n
    while (number > 0) {
        number = number and (number-1)
        count+=1
    }
    return count
}