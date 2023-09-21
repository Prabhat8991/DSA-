package phase2.recursion

fun jProblem(n: Int, k: Int): Int {
    if (n == 1) {
        return 0
    } else {
        return (jProblem(n-1, k)+k)%n
    }
}

fun main() {
    print(jProblem(5, 2))
}