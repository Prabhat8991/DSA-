package phase3.dynamicprogramming

import kotlin.math.abs
import kotlin.math.min


/**
 * There is a frog on the '1st' step of an 'N' stairs long staircase.
 * The frog wants to reach the 'Nth' stair. 'HEIGHT[i]' is the height of the
 * '(i+1)th' stair.If Frog jumps from 'ith' to 'jth' stair,
 * the energy lost in the jump is given by absolute value of ( HEIGHT[i-1] - HEIGHT[j-1] ).
 * If the Frog is on 'ith' staircase, he can jump either to '(i+1)th' stair or to '(i+2)th' stair.
 * Your task is to find the minimum total energy used by the frog to reach from '1st' stair to 'Nth'
 * stair.

For Example
If the given ‘HEIGHT’ array is [10,20,30,10], the answer 20 as the frog can jump from
1st stair to 2nd stair (|20-10| = 10 energy lost) and then a jump from 2nd
stair to last stair (|10-20| = 10 energy lost). So, the total energy lost is 20.

Sample Input 1:
2
4
10 20 30 10
3
10 50 10
Sample Output 1:
20
0
 */

fun main() {
    println(frogJump(intArrayOf(10, 20, 30, 10), 3))
    println(frogJumpDp(intArrayOf(10, 20, 30, 10), IntArray(4){-1}, 3))
    println(frogJumpTabulation(intArrayOf(10, 20, 30, 10), IntArray(4){-1}, 3))
}

//Recursive
fun frogJump(heights: IntArray, n: Int): Int {
    if (n == 0) {
        return 0
    }
    val left = frogJump(heights, n-1) + abs(heights[n] - heights[n-1])
    var right = Int.MAX_VALUE
    if (n > 1) {
         right = frogJump(heights, n - 2) + abs(heights[n] - heights[n - 2])
    }
    return min(left, right)
}

//Dynamic Programming

fun frogJumpDp(heights: IntArray, dpArray: IntArray, n: Int): Int {
    if (n == 0) {
        return 0
    }
    if (dpArray[n] != -1) {return dpArray[n]}
    val left = frogJump(heights, n-1) + abs(heights[n] - heights[n-1])
    var right = Int.MAX_VALUE
    if (n > 1) {
        right = frogJump(heights, n - 2) + abs(heights[n] - heights[n - 2])
    }
    dpArray[n] = min(left, right)
    return dpArray[n]
}

//Tabulation

fun frogJumpTabulation(heights: IntArray, dpArray: IntArray, n: Int): Int {
   var left = Int.MAX_VALUE
   var right = Int.MAX_VALUE
    dpArray[0] = 0
   for (i in 1 until n+1) {
       left = dpArray[i-1] + abs(heights[i] - heights[i-1])
       if ( i > 1) {
           right = dpArray[i - 2] + abs(heights[i] - heights[i - 2])
       }
       dpArray[i] = min(left, right)
   }
   return dpArray[n]
}
