package phase2.string.grind75

import java.math.BigInteger

fun main() {
  println(myAtoi("9223372036854775808"))
}

fun myAtoi(s: String): Int {
   var pointerEnd = s.length-1
   var pointerStart = 0
   var resultInt: BigInteger = BigInteger.valueOf(0)
   var intCounter = 0
   var sign = 1
   var startIndex = 0

   while (pointerStart < s.length) {
      if (s[pointerStart].isWhitespace()) {
         pointerStart++
         continue
      }
      if (!s[pointerStart].equals('+') && !s[pointerStart].equals('-')) {
         startIndex = pointerStart
         break
      }
      if (s[pointerStart].equals('+')) {
         sign = 1
         startIndex = pointerStart+1
         break
      }
      if (s[pointerStart].equals('-')) {
         sign = -1
         startIndex = pointerStart+1
         break
      }
      pointerStart+=1
   }

   while (pointerEnd >= startIndex) {
      if (s[pointerEnd].toInt() in 48..57) {
         resultInt += BigInteger.valueOf((Integer.valueOf(s[pointerEnd].toString()) * (Math.pow(10.0, intCounter.toDouble()))).toLong())
         intCounter+=1
      } else {
         resultInt = BigInteger.valueOf(0)
         intCounter = 0
      }
      pointerEnd-=1
   }

   resultInt *= sign.toBigInteger()

   if (resultInt >= Int.MAX_VALUE.toBigInteger()) {
      resultInt = Int.MAX_VALUE.toBigInteger()
   }

   if (resultInt <= Int.MIN_VALUE.toBigInteger()) {
      resultInt = Int.MIN_VALUE.toBigInteger()
   }

   return resultInt.toInt()
}