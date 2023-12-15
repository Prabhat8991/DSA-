package phase2.linkedlist;

import static phase2.linkedlist.Node.printLinkedList;

public class RemoveDuplicateFromSortedLinkedList {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(10);
        head.next = node1;
        Node node2 = new Node(20);
        node1.next = node2;
        Node node3 = new Node(30);
        node2.next = node3;
        Node node4 = new Node(30);
        node3.next = node4;
        Node node5 = new Node(40);
        node4.next = node5;
        Node node6 = new Node(50);
        node5.next = node6;

        removeDuplicates(head);

        printLinkedList(head);


    }

    private static void removeDuplicates(Node head) {

        Node currentNode = head;
        Node nextNode = head.next;

        while(currentNode.next != null) {
            if (nextNode == null) {
                currentNode.next = null;
                return;
            }
            if (currentNode.value != nextNode.value) {
                currentNode.next = nextNode;
                currentNode = nextNode;
            }
            nextNode = nextNode.next;
        }
    }
}
