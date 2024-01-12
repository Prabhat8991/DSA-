package phase2.linkedlist;

import static phase2.linkedlist.Node.printLinkedList;

public class PairwiseSwap {

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

        printLinkedList(head);

        System.out.println("After swapping...");
        printLinkedList(pairWiseSwap(head));
    }

    public static Node pairWiseSwap(Node head) {
        Node currentNode = head.next;
        Node prevNode = head;
        head = currentNode;
        head.next = prevNode;
        currentNode = prevNode.next.next;
        while (currentNode!= null && currentNode.next != null) {
            prevNode = prevNode.next;
            prevNode.next = currentNode.next;
            currentNode.next = prevNode;
            currentNode = prevNode.next.next;
        }

//        if (currentNode != null) {
//            prevNode.next = currentNode;
//        }
        return head;
    }


}
