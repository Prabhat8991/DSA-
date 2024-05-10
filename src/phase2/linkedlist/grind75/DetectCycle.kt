package phase2.linkedlist.grind75

fun main() {

}

fun hasCycle(head: ListNode?): Boolean {
    var slowPtr = head
    var fastPtr = head
    var hasLoop = false

    while (slowPtr!!.next != null && fastPtr!!.next!!.next != null) {
        slowPtr = slowPtr.next
        fastPtr = fastPtr.next!!.next
        if (slowPtr == fastPtr) {
            hasLoop = true
            break
        }

    }
    return hasLoop
}

