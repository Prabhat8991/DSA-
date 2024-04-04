package phase2.array.grind75

fun main() {
    var input = intArrayOf(7,1,5,3,6,4)
    println(maxProfit(input))
}

fun maxProfit(prices: IntArray): Int {
    var lowPriceCounter = 0
    var maxProfit = 0

    for(i in prices.indices) {
        if (prices[lowPriceCounter] < prices[i]) {
           var profit = prices[i] - prices[lowPriceCounter]
           if (maxProfit < profit) {
               maxProfit = profit
           }
        } else {
            lowPriceCounter = i;
        }

    }

    return maxProfit
}