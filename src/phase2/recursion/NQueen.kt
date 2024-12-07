package phase2.recursion

fun main() {

}

//fun solveNQueens(n: Int): List<List<String>> {
//
//}

fun solve(n: Int, res: ArrayList<ArrayList<String>>, board: ArrayList<ArrayList<String>>, row: Int, col: Int, leftPosition: ArrayList<ArrayList<String>>, diagnolTopLeft: ArrayList<String>, diagnolBottomLeft: ArrayList<String> ) {
    if (col == n) {
        res.addAll(ArrayList(board))
        return
    }

    for (i in 0 until n) {
        if (canPlaceQueen(n, row, col, leftPosition, diagnolTopLeft, diagnolBottomLeft)) {
            board[row][col] = "Q"
            leftPosition[row][col] = "Q"
            diagnolBottomLeft[row + col] = "Q"
            diagnolTopLeft[n-1 + (col - row)] = "Q"
            solve(n, res, board, i, col+1, leftPosition, diagnolTopLeft, diagnolBottomLeft)
            board[row][col] = "."
        }
    }
}

fun canPlaceQueen(n: Int, row: Int, col: Int, leftPosition: ArrayList<ArrayList<String>>, diagnolTopLeft: ArrayList<String>, diagnolBottomLeft: ArrayList<String>): Boolean {
    for (i in 0 until col) {
        if (leftPosition[row][i] == "Q") {
            return false
        }
    }

   if (diagnolBottomLeft[row + col] == "Q") {
       return false
   }

   if (diagnolTopLeft[n-1 + (col - row)] == "Q") {
       return false
   }

   return true
}