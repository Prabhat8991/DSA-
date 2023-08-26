package phase1.matrix

fun main() {
  transpose(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6))).forEach {
      it.forEach {element ->
          print(element)
      }
      println()
  }
}

fun transpose(matrix: Array<IntArray>): Array<IntArray> {
   for (i in 0..matrix.lastIndex) {
       for (j in i+1..matrix.lastIndex) {
           swap(matrix, i, j)
       }
   }
    return matrix
}

fun swap(matrix: Array<IntArray>, i: Int, j: Int) {
    var temp = 0
    temp = matrix[i][j]
    matrix[i][j] = matrix[j][i]
    matrix[j][i] = temp
}