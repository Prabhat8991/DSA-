package phase2.linkedlist.grind75

fun main() {

}

fun middleNode(head: ListNode?): ListNode? {
  var slowPtr = head
  var fastPtr = head

  while (fastPtr != null && fastPtr.next != null) {
      slowPtr = slowPtr!!.next
      fastPtr = fastPtr.next!!.next
  }

    return slowPtr
}