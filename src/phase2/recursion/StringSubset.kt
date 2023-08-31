package phase2.recursion

fun printStringSubset(str: String, res: String, index: Int) {

    if (index == str.length-1) {
        print(" $res")
        return
    }
    printStringSubset(str, res, index+1)
    printStringSubset(str, res + str[index+1], index+1)
}

fun main() {
    printStringSubset("abc", "", -1)
}
