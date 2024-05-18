package phase2.bitwise.leetcode.easy

fun main() {
    println(isPowerOfTwo(32))
}

fun isPowerOfTwo(n: Int): Boolean {
    return (n > 0) && (n and (n - 1)) == 0
}