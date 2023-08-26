package phase1.matrix

fun main() {
    var matrix = arrayOf(intArrayOf(1, 2, 3,4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12), intArrayOf(13, 14, 15, 16))
    rotate(matrix)
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            print(matrix[i][j])
        }
        println()
    }
}

fun rotate(matrix: Array<IntArray>): Unit {
   transpose(matrix)
   for (i in matrix.indices)  {
       for (j in 0 until (matrix[i].size/2)) {
           var rowSize = matrix[i].size
           var temp = matrix[i][j]
           matrix[i][j] = matrix[i][rowSize-1-j]
           matrix[i][rowSize-1-j] = temp
       }
   }
}

