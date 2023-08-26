package phase1.matrix

fun main() {
    rotateMatrixAntiClockWise(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9)))
}

fun rotateMatrixAntiClockWise(matrix: Array<IntArray>) {
    transposeMatrix(matrix)
    //interchange row first -><- last , second -><- second last
    for (i in 0..matrix.size / 2) {
        for (j in matrix[i].indices) {
            var temp = matrix[i][j]
            matrix[i][j] = matrix[matrix.size - 1 - i][j]
            matrix[matrix.size - 1 - i][j] = temp
        }
    }

    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            print(matrix[i][j])
        }
        println()
    }
}

fun transposeMatrix(matrix: Array<IntArray>) {
    for (i in matrix.indices) {
        for (j in i + 1 until matrix[i].size) {
            var temp = matrix[i][j]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }
}