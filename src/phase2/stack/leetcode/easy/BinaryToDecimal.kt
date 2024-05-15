package phase2.stack.leetcode.easy

import phase2.linkedlist.grind75.ListNode

fun main() {

}

fun getDecimalValue(head: ListNode?): Int {
    var length =  0
    var node = head
    var result: Double = 0.0
    while (node != null) {
        length+=1
        node = node.next
    }

    node = head

    while (node != null) {
        length -= 1
        result+=node.value*Math.pow((2).toDouble(), (length).toDouble())
        node = node.next
    }

    return result.toInt()
}