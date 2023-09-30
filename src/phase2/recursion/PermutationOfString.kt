package phase2.recursion

fun main() {
    print(permutationOfString("ABC", 0))
}

fun permutationOfString(str: String, i: Int): String {
    var res = str
    if (i == res.length-1) {
        println(res)
        return res
    }

    for (j in i until res.length) {
        res = swap(i, j, res)
        res = permutationOfString(res, i+1)
        res = swap(i, j, res)
    }
    return res
}

fun swap(i: Int, j: Int, str: String): String {
    val charArray =  str.toCharArray()
    val temp = charArray[i]
    charArray[i] =  charArray[j]
    charArray[j] =  temp
    return String(charArray)
}