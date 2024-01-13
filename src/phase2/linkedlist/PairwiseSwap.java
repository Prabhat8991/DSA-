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
        Node currentNode = head.next.next; //currentNode = 30
        head.next.next = head; // 20 -> 10
        head = head.next; //head == 20
        Node previous = head.next; // prev = 10

        while (currentNode!=null && currentNode.next != null) {
            previous.next = currentNode.next; //10 -> 40
            Node temp = currentNode.next.next; //temp = 50
            currentNode.next.next = currentNode; //40->30
            previous = currentNode; // prev = 30
            currentNode = temp;
        }
        previous.next = currentNode; // for handling currentNode == null and currentNode.next == null
        return head;
    }


}
