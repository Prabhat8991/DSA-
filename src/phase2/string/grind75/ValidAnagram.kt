package phase2.string.grind75

fun main() {
  println(isAnagram("anagrm", "nagaram"))
}

fun isAnagram(s: String, t: String): Boolean {

  if (s.length != t.length) {
    return false
  }

  val intArray = IntArray(130){0}

  s.forEach {
      intArray[it.toInt()]+=1
  }

  t.forEach {
    intArray[it.toInt()]-=1
  }

  intArray.forEach {
    if (it != 0) {
      return false
    }
  }
  return true
}