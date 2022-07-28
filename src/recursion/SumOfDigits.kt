package recursion

fun main() {
    print(sumOfDigits(123))
}

fun sumOfDigits(n: Int):Int {
    if (n<10) return n
    return (n%10)+ sumOfDigits(n/10)
}