package phase2.linkedlist;

import static phase2.linkedlist.Node.printLinkedList;

public class DetectAndRemoveLoopInLinkedList {
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
        node4.next = node2;
        //printLinkedList(head);
        detectAndRemoveLoopInLinkedList(head);
        printLinkedList(head);
    }

    private static void detectAndRemoveLoopInLinkedList(Node head) {
        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer) {
                slowPointer = head;
                break;
            }
        }
        while (slowPointer.next != fastPointer.next) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        fastPointer.next = null;
    }
}
