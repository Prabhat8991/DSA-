package phase1.string

fun main() {
  print(checkInclusion("ab", "eidbaooo"))
}

fun checkInclusion(s1: String, s2: String): Boolean {
   var arr1 = IntArray(26)

   s1.forEach {
       arr1[it - 'a']++
   }

   var i  = 0
    var arr2 = IntArray(26)
    while (i < s1.length && i < s2.length) {
        arr2[s2.toCharArray()[i] - 'a']++
        i++
    }
    if(areArraysEqual(arr1, arr2)) {
        return true
    }
    var k = s1.length
    while (i < s2.length) {
        arr2[s2.toCharArray()[i-k] - 'a']--
        arr2[s2.toCharArray()[i] - 'a']++
        i++
        if (areArraysEqual(arr1, arr2)) {
            return true
        }
    }
    return false
}

fun areArraysEqual(arr1: IntArray, arr2: IntArray): Boolean {
    var isEqual = true

    for (i in 0..25) {
        if(arr1[i] != arr2[i]) {
            isEqual = false
        }
    }
    return isEqual
}