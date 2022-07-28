package recursion

fun main() {
    print(factorial(5))
}

fun factorial(n: Int): Int {
    if(n == 1) {
        return 1
    }
    return n*factorial(n-1)
}
