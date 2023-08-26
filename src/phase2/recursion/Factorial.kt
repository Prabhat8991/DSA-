package phase2.recursion

fun factorial(n: Int): Int {
    if (n == 1)
        return n
    return factorial(n-1)*n
}

fun main() {
    print(factorial(5))
}