package phase2.linkedlist.leetcode.easy

import phase2.linkedlist.grind75.ListNode

fun main() {

}

fun deleteDuplicates(head: ListNode?): ListNode? {
   var indexPointer = head
    while (indexPointer?.next != null) {
        if (indexPointer.value == indexPointer.next?.value) {
            indexPointer.next = indexPointer.next?.next
            continue
        }
        indexPointer = indexPointer.next
    }

    return head
}