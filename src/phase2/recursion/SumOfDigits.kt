package phase2.recursion

fun sumofDigits(n: Int): Int {
    if (n == 0) {
        return n
    }

    return sumofDigits(n/10) + n%10
}

fun main() {
    println(sumofDigits(123456))
}
