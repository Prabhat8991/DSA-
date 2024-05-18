package phase2.bitwise.leetcode.medium

fun main() {

}

fun findKthBit(n: Int, k: Int): Char {
   var x = 1 shl (k-1)

    if (n and x != 0) {
        return '1'
    } else {
        return '0'
    }
}