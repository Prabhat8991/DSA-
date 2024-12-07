package phase2.recursion

fun main() {
    solveNQueens(4).forEach { println(it) }
}

fun solveNQueens(n: Int): List<List<String>> {
    val res = arrayListOf<List<String>>()
    val board = Array(n) { CharArray(n) { '.' } } // Initialize the board with '.'
    val rowOccupied = BooleanArray(n) // Tracks rows
    val diagonalTopLeft = BooleanArray(2 * n - 1) //Because 2n-1 diagonals are possible
    val diagonalBottomLeft = BooleanArray(2 * n - 1) // Because 2n-1 diagonals are possible

    solve(n, res, board, 0, rowOccupied, diagonalTopLeft, diagonalBottomLeft)
    return res
}

fun solve(
        n: Int,
        res: ArrayList<List<String>>,
        board: Array<CharArray>,
        col: Int,
        rowOccupied: BooleanArray,
        diagonalTopLeft: BooleanArray,
        diagonalBottomLeft: BooleanArray
) {
    // Base case: If all queens are placed, add the solution to the result
    if (col == n) {
        res.add(board.map { it.joinToString("") }) // Convert board to List<String>
        return
    }

    // Try placing a queen in each row for the current column
    for (row in 0 until n) {
        if (canPlaceQueen(n, row, col, rowOccupied, diagonalTopLeft, diagonalBottomLeft)) {
            // Place the queen
            board[row][col] = 'Q'
            rowOccupied[row] = true
            diagonalTopLeft[row - col + n - 1] = true
            diagonalBottomLeft[row + col] = true

            // Recurse to the next column
            solve(n, res, board, col + 1, rowOccupied, diagonalTopLeft, diagonalBottomLeft)

            // Backtrack: Remove the queen
            board[row][col] = '.'
            rowOccupied[row] = false
            diagonalTopLeft[row - col + n - 1] = false
            diagonalBottomLeft[row + col] = false
        }
    }
}

fun canPlaceQueen(
        n: Int,
        row: Int,
        col: Int,
        rowOccupied: BooleanArray,
        diagonalTopLeft: BooleanArray,
        diagonalBottomLeft: BooleanArray
): Boolean {
    return !rowOccupied[row] &&
            !diagonalTopLeft[row - col + n - 1] &&
            !diagonalBottomLeft[row + col]
}

}