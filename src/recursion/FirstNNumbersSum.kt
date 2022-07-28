package recursion

fun main() {
    print(sumOfFirstN(3))
}

fun sumOfFirstN(n : Int): Int {
    if (n == 1) return 1
    return n + sumOfFirstN(n-1)
}