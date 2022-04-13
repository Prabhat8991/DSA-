package string

fun main() {
  print(restoreString("codeleet", intArrayOf(4,5,6,7,0,2,1,3)))
}

fun restoreString(s: String, indices: IntArray): String {
    var outputString = CharArray(s.length)

    s.forEachIndexed { index, c ->
        outputString[indices[index]] = c
    }
 return String(outputString)
}
