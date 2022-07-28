package recursion

fun main() {
    print(fibonacci(5))
}

fun fibonacci(n: Int): Int {
    if(n <= 1) return n
    return fibonacci(n-1) + fibonacci(n-2)
}