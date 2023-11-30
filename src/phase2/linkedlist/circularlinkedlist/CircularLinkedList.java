package phase2.linkedlist.circularlinkedlist;


import phase2.linkedlist.Node;

public class CircularLinkedList {

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
    }

    public static void printCircularLinkedList(Node head) {
        if (head != null) {
            System.out.println(head.value);
        }

        Node current = head.next;
        while (current != head ) {
            System.out.println(current.value);
            current = current.next;
        }
    }

}
