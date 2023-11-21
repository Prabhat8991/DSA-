package phase2.linkedlist.doublylinkedlist;

import static phase2.linkedlist.doublylinkedlist.Node.printDoublyLinkedList;

public class InsertAtTheEndOfDoublyLinkedList {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(15);

        head.next = node1;
        node1.prev = head;

        Node node2 = new Node(20);
        node1.next = node2;
        node2.prev = node1;

        Node node3 = new Node(25);
        node2.next = node3;
        node3.prev = node2;

        printDoublyLinkedList(head);

        Node node4 = new Node(30);

        insertAtTheEndOfDoublyLinkedList(head, node4);

        printDoublyLinkedList(head);

    }

    private static void insertAtTheEndOfDoublyLinkedList(Node head, Node newNode) {
        Node node = head;
        while(node.next != null) {
            node = node.next;
        }
        node.next = newNode;
        newNode.prev = node;
    }
}
