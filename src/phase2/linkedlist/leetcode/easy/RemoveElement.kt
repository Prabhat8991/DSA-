package phase2.linkedlist.leetcode.easy

import phase2.linkedlist.grind75.ListNode

fun main() {

}

fun removeElements(head: ListNode?, `val`: Int): ListNode? {
  var result:ListNode? = null
    var node =  head
    while (node != null) {
        if (node.value != `val`) {
            if (result == null) {
                result = ListNode(node.value)
            } else {
                result.next = ListNode(node.value)
            }
        }
        node = node.next
    }
    return result
}