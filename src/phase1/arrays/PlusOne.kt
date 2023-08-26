package phase1.arrays

fun main() {
  plusOne(intArrayOf(9,9,9)).forEach {
      print(it)
  }
}

fun plusOne(digits: IntArray): IntArray {
    var carry = 1
    var j = digits.size-1
    var sum = 0
    var resultInt = 0
    var resultArray = mutableListOf<Int>()
    while(j >=0) {
        sum = digits[j] + carry
        resultInt = sum%10
        carry = sum/10
        if(j == 0 && carry > 0) {
            resultArray.add(resultInt)
            resultArray.add(carry)
            break
        } else {
            resultArray.add(resultInt)
        }
        j--
    }
    return resultArray.asReversed().toIntArray()

}