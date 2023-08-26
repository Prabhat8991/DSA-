package phase1.arrays

fun main() {
  print(rotateString("abcde", "abced"))
}

fun rotateString(s: String, goal: String): Boolean {
    if (s.length != goal.length) {
        return false
    }
    var input = s+s
    return input.indexOf(goal) >= 0
}
