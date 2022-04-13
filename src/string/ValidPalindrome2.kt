package string

fun main() {
    //aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga
  print(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"))
}

fun validPalindrome(s: String): Boolean {
  var i = 0
  var j = s.length-1
  var arr = s.toCharArray()
  var faultyi = 0
  var faultyj = 0
  if(checkPalindrome(arr))  {
      return true
  }
  while (i < j) {
    if (arr[i] != arr[j]) {
        faultyi = i
        faultyj = j
        break
    }
      i++
      j--
  }
  //try removing i only
  var sb = StringBuilder(s)
    sb.deleteCharAt(faultyi)
    arr = sb.toString().toCharArray()
    if(checkPalindrome(arr)) {
        return true
    }

    //try removing j only
    sb = StringBuilder(s)
    sb.deleteCharAt(faultyj)
    arr = sb.toString().toCharArray()
    if (checkPalindrome(arr)) {
        return true
    }

    return false
}

fun checkPalindrome (arr: CharArray): Boolean {
  var i = 0
  var j = arr.lastIndex
  while (i < j) {
      if (arr[i] == arr[j]) {
          i++
          j--
      } else {
          return false
      }
  }
    return true
}