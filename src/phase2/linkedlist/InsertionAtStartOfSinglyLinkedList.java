package phase2.linkedlist;

public class InsertionAtStartOfSinglyLinkedList {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printLinkedList(head);

        //Inserting at the start of Linked List
        Node newHead = new Node(5);
        newHead.next = head;
        printLinkedList(newHead);

    }


    public static void printLinkedList(Node head) {

        if (head == null) {
            return;
        }
        System.out.println(head.value);

        printLinkedList(head.next);
    }
}
