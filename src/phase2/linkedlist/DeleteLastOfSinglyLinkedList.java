package phase2.linkedlist;

import static phase2.linkedlist.Node.printLinkedList;

public class DeleteLastOfSinglyLinkedList {

    public static void main(String[] args) {
       Node head = new Node(10);
       head.next = new Node(20);
       head.next.next = new Node(30);
       head.next.next.next = new Node(40);
       head.next.next.next.next = new Node(50);

        printLinkedList(head);
        System.out.println("After deleting .....");
        deleteLastNode(head);

        printLinkedList(head);
    }

    private static void deleteLastNode(Node linkedList) {
        Node currentNode = linkedList;
        while (currentNode.next != null) {
            if (currentNode.next.next == null) {
                currentNode.next = null;
                break;
            }
            currentNode = currentNode.next;
        }
    }


}
