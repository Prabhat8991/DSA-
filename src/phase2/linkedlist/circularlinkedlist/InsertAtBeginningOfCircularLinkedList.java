package phase2.linkedlist.circularlinkedlist;

import phase2.linkedlist.Node;

import static phase2.linkedlist.circularlinkedlist.CircularLinkedList.printCircularLinkedList;

public class InsertAtBeginningOfCircularLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);

        Node node1 = new Node(20);
        head.next = node1;

        Node node2 = new Node(30);
        node1.next = node2;

        Node node3 = new Node(40);
        node2.next = node3;

        Node node4 = new Node(50);
        node3.next = node4;

        node4.next = head;

        printCircularLinkedList(head);

        System.out.println("After Insertion");

        insertAtBeginningOfCircularLinkedList(head, new Node(5));

        printCircularLinkedList(head);

    }

    private static void insertAtBeginningOfCircularLinkedList(Node head, Node newNode) {
        Node temp = head.next;
        head.next = newNode;
        newNode.next = temp;

        int headVal = head.value;
        head.value = newNode.value;
        newNode.value = headVal;
    }
}
