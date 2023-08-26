package phase1.string

fun main(args: Array<String>) {
      val inputString = "ggekksffd"
      print(findLeftMostNonRepeatingChar(inputString))
    }

fun findLeftMostNonRepeatingChar(inputString: String): Int {

    var min = Integer.MAX_VALUE
    var indexArray = Array(256) {
        -1
    }

    for(i in inputString.indices) {
        if(indexArray[inputString[i].toInt()] == -1) {
            indexArray[inputString[i].toInt()] = i
        } else {
            indexArray[inputString[i].toInt()] = -2
        }
    }

    for(i in indexArray.indices) {
        if(indexArray[i] > 0) {
            min = minOf(min, indexArray[i])
        }
    }
    return min
}
