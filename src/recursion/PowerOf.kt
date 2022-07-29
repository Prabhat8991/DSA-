package recursion

fun main() {
    print(powerOf(2,3))
}

fun powerOf(a: Int, b:Int): Int {


    return a* powerOf(a, b-1)
}
