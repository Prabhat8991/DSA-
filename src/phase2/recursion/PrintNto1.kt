package phase2.recursion

fun printNto1(n:Int) {
    if (n == 0) {
        return
    }
    println(n)
    printNto1(n-1)
}

fun main() {
    printNto1(6)
}