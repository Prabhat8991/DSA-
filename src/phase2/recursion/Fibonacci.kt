package phase2.recursion

fun getNFibonacci(n: Int): Int {
   if(n == 0) return 0
    if (n == 1) return 1
    return getNFibonacci(n-1) + getNFibonacci(n-2)
}

fun main() {
    print(getNFibonacci(6
    ))
}