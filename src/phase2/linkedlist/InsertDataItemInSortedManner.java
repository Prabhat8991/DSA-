package phase2.linkedlist;

import static phase2.linkedlist.Node.printLinkedList;

public class InsertDataItemInSortedManner {

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
        System.out.println("After insertion .....");
        printLinkedList(insertNodeInSortedManner(head, new Node(60)));
    }

    private static Node insertNodeInSortedManner(Node head, Node newNode) {
        Node currentNode = head;

        if (currentNode.value > newNode.value) {
            newNode.next = currentNode;
            return newNode;
        }

        while(currentNode.next != null && currentNode.next.value < newNode.value) {
            currentNode = currentNode.next;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return head;
    }
}
