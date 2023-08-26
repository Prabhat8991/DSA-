package phase1.string

fun main() {
  print(removeDuplicates("azxxzssypp"))
}

fun removeDuplicates(s: String): String {
    var inputString = s
    var i = 0
   while(i < inputString.length-1) {
       if (inputString[i] == inputString[i+1]) {
           inputString = inputString.removeRange(i, i+2)
           if(i == 0) {
               i -= 1
           }
           if(i > 0) {
               i -= 2
           }
       }
       i++

   }
    return inputString
}
