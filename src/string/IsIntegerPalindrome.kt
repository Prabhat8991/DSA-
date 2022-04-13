package string

fun main() {
    print(isPalindrome(
            1000000001))
}

fun isPalindrome(x: Int): Boolean {
    var input: Long = x.toLong()
    var result: Long = 0
    var remainder: Long = 0
    if(input < 0) {
        return false
    }
    var tenPower: Long = 1
    while (input > 0) {
        tenPower*=10
        input /= 10
    }
    input = x.toLong()
    tenPower /= 10
    while(input > 0) {
        remainder = input%10
        result += tenPower * remainder
        input /= 10
        tenPower /= 10
    }

    return result == x.toLong()

}