package phase2.linkedlist;

import static phase2.linkedlist.Node.printLinkedList;

public class ReverseLinkedListUsingRecursion {

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

        printLinkedList(reverseLinkedList(head, null));
    }

    private static Node reverseLinkedList(Node currentNode, Node prevNode) {
        if (currentNode == null) {
            return prevNode;
        }

        Node temp = currentNode.next;
        currentNode.next = prevNode;
        prevNode = currentNode;
        currentNode = temp;
        return reverseLinkedList(currentNode, prevNode);
    }

}
