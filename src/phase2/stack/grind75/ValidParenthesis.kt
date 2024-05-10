package phase2.stack.grind75

import java.util.*


fun main() {
println(isValid("(){{}{}}[]"))
}

fun isValid(s: String): Boolean {
  val parenthesisStack = Stack<Char>()
  s.forEach {
    if (it == '(' || it == '{' || it == '[') {
        parenthesisStack.push(it)
    } else if (parenthesisStack.isNotEmpty() && (it == ')' || it == '}' || it == ']')) {
       if (!isMatching(parenthesisStack.peek(), it)) {
         return false
       } else {
            parenthesisStack.pop()
       }
    } else {
      return false
    }
  }
  return parenthesisStack.isEmpty()
}

fun isMatching(stackChar: Char, inComingChar: Char): Boolean {
  return ((stackChar == '(' && inComingChar == ')') || (stackChar == '{' && inComingChar == '}') || (stackChar == '[' && inComingChar == ']'))
}