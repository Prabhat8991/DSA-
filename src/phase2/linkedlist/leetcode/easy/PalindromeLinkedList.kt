package phase2.linkedlist.leetcode.easy

import phase2.linkedlist.grind75.ListNode

fun main() {
    var head = ListNode(1)
    var node1 = ListNode(1)
    head.next = node1
//    var node2 = ListNode(2)
//    node1.next = node2
//    var node3 = ListNode(1)
//    node2.next = node3
//    var node4 = ListNode(1)
//    node3.next = node4

    print(isPalindrome(head))
}

fun isPalindrome(head: ListNode?): Boolean {

    var slowPtr = head
    var fastPtr = head
    var counter = 0
    var countHead = head

    while (countHead != null) {
        counter+=1
        countHead = countHead.next
    }

    while (fastPtr?.next != null) {
        slowPtr = slowPtr!!.next
        fastPtr = fastPtr.next!!.next
    }

    //now reverse till prev and return head
    var prevNode: ListNode? = null
    var nextNode =  head
    while (nextNode != slowPtr) {
        val temp = nextNode?.next
        nextNode?.next = prevNode
        prevNode = nextNode
        nextNode = temp
    }

    if (counter%2 != 0) {
        slowPtr = slowPtr?.next
    }

    while (prevNode != null && slowPtr != null) {
        if (prevNode.value != slowPtr.value) {
            return false
        }
        prevNode = prevNode.next
        slowPtr = slowPtr.next
    }
    return true
}