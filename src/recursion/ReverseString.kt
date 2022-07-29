package recursion

import java.lang.StringBuilder

fun main() {
   print(reverseString("Prabhat", 6))
}

fun reverseString(str: String, c: Int): String {

    val sb = StringBuilder()
    sb.append(str.toCharArray()[c])
    if (c == 0) {
        return sb.toString()
    }

    return sb.append(reverseString(str, c - 1)).toString()
}