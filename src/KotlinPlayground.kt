fun main() {
    var head = Node(10)
    var node1 = Node(20)
    head.next = node1

    var node2 = Node(30)
    node1.next = node2

    var node3 = Node(40)
    node2.next = node3

    printLinkedList(head)




}

fun printLinkedList(head: Node?) {
    var currentNode = head
    while(currentNode != null) {
        println(currentNode.num)
        currentNode = currentNode.next
    }
}

class Node(var num: Int) {

    public var next: Node? = null

}