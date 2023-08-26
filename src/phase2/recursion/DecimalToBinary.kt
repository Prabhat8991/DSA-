package phase2.recursion

fun decimalToBinaryConversion(n: Int) {
    if (n == 0) {
        return
    }
    decimalToBinaryConversion(n/2)
    print(n%2)
}

fun main() {
    decimalToBinaryConversion(13)
}