package phase2.bitwise.leetcode.easy

fun main() {
countBits(5).forEach {
    println(it)
}
}

fun countBits(n: Int): IntArray {
   var resultArray: IntArray = IntArray(n+1)
  for (i in 0..n) {
      resultArray[i] = count(i)
  }
    return resultArray
}

fun count(num: Int): Int {
    var result = 0
    var number = num
    while (number > 0) {
        number = number and number-1
        result+=1
    }
    return result
}