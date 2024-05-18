package phase2.linkedlist.leetcode.medium

import phase2.linkedlist.grind75.ListNode

fun main() {
    var head = ListNode(1)
    //var node1 = ListNode(2)
    //head.next = node1
//    var node2 = ListNode(3)
//    node1.next = node2
//    var node3 = ListNode(4)
//    node2.next = node3
//    var node4 = ListNode(5)
//    node3.next = node4

    var result = deleteMiddle(head)
    println(result)
}

fun deleteMiddle(head: ListNode?): ListNode? {

    if (head!!.next == null) {
        return null
    }
    var prevNode: ListNode? = null
    var slowPointer: ListNode? = head
    var fastPointer: ListNode? = head

    while (fastPointer?.next != null) {
        prevNode = slowPointer
        slowPointer = slowPointer!!.next
        fastPointer = fastPointer!!.next!!.next
    }
    prevNode!!.next = prevNode!!.next!!.next
    return head
}