package phase2.linkedlist.grind75

fun main() {
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
   var pointer1 = list1
   var pointer2 = list2
   var resultLinkedList: ListNode? = null

   while (pointer1 != null && pointer2 != null) {
       var node: ListNode? = null
       if (pointer1.value <= pointer2.value) {
           node = ListNode(pointer1.value)
           pointer1 = pointer1.next
       } else {
           node = ListNode(pointer2.value)
           pointer2 = pointer2.next
       }
       if (resultLinkedList == null) {
           resultLinkedList = node
       } else {
           resultLinkedList.next = node
       }
   }
    return resultLinkedList
}

class ListNode(var value: Int) {
        var next: ListNode? = null
}