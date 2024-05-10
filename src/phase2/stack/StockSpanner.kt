package phase2.stack

import java.util.Stack


fun main() {
    //[100],[80],[60],[70],[60],[75],[85]]
    var stockSpanner = StockSpanner()
    println(stockSpanner.next(100))
    println(stockSpanner.next(80))
    println(stockSpanner.next(60))
    println(stockSpanner.next(70))
    println(stockSpanner.next(60))
    println(stockSpanner.next(75))
    println(stockSpanner.next(85))

}

class StockSpanner() {

    var index = 0
    var spanStack = Stack<Pair<Int, Int>>()

    fun next(price: Int): Int {
        if (index == 0) {
            spanStack.push(Pair(0, price))
            index+=1
            return 1
        }

        while (spanStack.isNotEmpty() && spanStack.peek().second <= price) {
            spanStack.pop()
        }

        val span = if(spanStack.isEmpty()) {
            index+1
        } else {
            index - spanStack.peek().first
        }
        spanStack.push(Pair(index, price))
        index+=1
        return span
    }

}