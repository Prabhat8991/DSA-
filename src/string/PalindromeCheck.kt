package string

import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {
   print(isPalindrome("00"))
}

fun isPalindrome(inputString: String):Boolean {
    var inputArray = mutableListOf<Char>()
    inputString.trim().forEach { c->
        if (c in 'a'..'z' || c in '0'..'9') {
            inputArray.add(c)
        } else if( c in 'A'..'Z') {
            inputArray.add(c.toLowerCase())
        }
    }

    var start = 0
    var end = inputArray.size-1
    var isPalindrome: Boolean = true
    while (start <= end) {
        if(inputArray[start] != inputArray[end]) {
            isPalindrome = false
        }
        start++
        end--
    }
    return isPalindrome
}