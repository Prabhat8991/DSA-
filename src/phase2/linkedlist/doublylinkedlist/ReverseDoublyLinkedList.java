package phase2.linkedlist.doublylinkedlist;

import static phase2.linkedlist.doublylinkedlist.Node.printDoublyLinkedList;

public class ReverseDoublyLinkedList {
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

        System.out.println();

        printDoublyLinkedList(reverseDoublyLinkedList(head));

    }

    private static Node reverseDoublyLinkedList(Node head) {

        Node temp = head.next;
        head.next = null;
        head.prev = temp;

        Node nextNode = head.prev;
        Node newHead = head;

        while(nextNode != null) {
            Node tempNode = nextNode.next;
            nextNode.next = nextNode.prev;
            nextNode.prev = tempNode;

            if (nextNode.prev == null) {
                newHead = nextNode;
            }
            nextNode = nextNode.prev;
        }
        return newHead;
    }
}
