package phase2.linkedlist.circularlinkedlist;

import phase2.linkedlist.Node;

import static phase2.linkedlist.circularlinkedlist.CircularLinkedList.printCircularLinkedList;

public class DeleteKthofCircularLinkedList {

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

        deleteKthNode(head, 4);

        System.out.println("After deletion");

        printCircularLinkedList(head);

    }

    private static void deleteKthNode(Node head, int k) {
        Node currentNode = head;
        for (int i = 1; i < k-1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next= currentNode.next.next;
    }

}
