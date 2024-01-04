package phase2.linkedlist;

import static phase2.linkedlist.Node.printLinkedList;

public class SegregateEvenAndOddNodesInLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        head.next = node1;
        Node node2 = new Node(3);
        node1.next = node2;
        Node node3 = new Node(4);
        node2.next = node3;
        Node node4 = new Node(5);
        node3.next = node4;
        Node node5 = new Node(6);
        node4.next = node5;
        printLinkedList(head);
        Node newNode = segregateEvenAndOddNodesInLinkedList(head);
        System.out.println("After segregation ...");
        printLinkedList(newNode);
    }

    private static Node segregateEvenAndOddNodesInLinkedList(Node head) {
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.value % 2 == 0) {
                if (evenStart == null) {
                    evenStart = currentNode;
                } else {
                    evenEnd.next = currentNode;
                }
                evenEnd = currentNode;
            } else {
                if (oddStart == null) {
                    oddStart = currentNode;
                } else {
                    oddEnd.next = currentNode;
                }
                oddEnd = currentNode;
            }
            currentNode = currentNode.next;
        }
        if (evenStart == null || oddStart == null) {
            return head;
        }
        evenEnd.next = oddStart;
        oddEnd.next = null;
        return evenStart;
    }
}
