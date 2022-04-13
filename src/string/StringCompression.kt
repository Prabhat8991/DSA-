package string

fun main() {
  var input = charArrayOf('a','b','b','b','b','b','b','b','b','b','b','b','b','c')
  println(" "+compress(input))
}

fun compress(chars: CharArray): Int {
    val result = mutableListOf<Char>()
    var counter = 1
    for (i in chars.indices){
        if ( i == chars.lastIndex || chars[i] != chars[i+1]) {
            result.add(chars[i])
            if(counter > 1) {
                counter.toString().forEach {
                    result.add(it)
                }
                counter = 1
            }
        } else {
            counter++
        }
    }

    result.forEachIndexed { index, c ->
        chars[index] = c
    }
    chars.forEach {
        print(it)
    }
   return result.size
}