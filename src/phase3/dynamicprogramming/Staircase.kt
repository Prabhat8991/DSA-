package phase3.dynamicprogramming

fun main() {
    println(climbStairs(3))

}

fun climbStairs(n: Int): Int {
    var dpArray = IntArray(n){-1}
    return solveClimbStairs(n, dpArray)
}

fun solveClimbStairs(n: Int, dp: IntArray): Int {
   if (n == 0) {
       return 1
   } else if (n < 0) {
       return 0
   }

   if (dp[n-1] != -1) {
       return dp[n-1]
   }

    dp[n-1] = solveClimbStairs(n - 1, dp) + solveClimbStairs(n - 2, dp)
    return dp[n-1]
}