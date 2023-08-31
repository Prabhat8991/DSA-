package phase2.recursion

fun numberOfPieces(n: Int, a: Int, b: Int, c:Int): Int {
    if (n == 0) return 0

    if (n < 0) return -1

    val res1 = numberOfPieces(n-a, a, b, c)
    val res2 = numberOfPieces(n-b, a, b, c)
    val res3 = numberOfPieces(n-c, a, b, c)

    val res4 = maxOf(res1, res2)
    val finalRes = maxOf(res4, res3)

    if (finalRes < 0) {
        return finalRes
    }

    return finalRes+1
}

fun main() {
    print(numberOfPieces(23, 11, 12, 9))
}