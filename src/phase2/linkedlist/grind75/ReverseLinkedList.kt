package phase2.linkedlist.grind75

fun main() {

}

fun reverseList(head: ListNode?): ListNode? {
    var temp: ListNode? = null
    var node = head
    var prev: ListNode? = null

    while (node != null) {
        temp = node.next
        node.next = prev
        prev = node
        node = temp
    }

    return prev
}