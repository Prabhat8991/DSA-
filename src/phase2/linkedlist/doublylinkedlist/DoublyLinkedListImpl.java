package phase2.linkedlist.doublylinkedlist;

public class DoublyLinkedListImpl {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node node2 = new Node(20);
        head.next = node2;
        head.prev = head;

        Node node3 = new Node(30);
        head.next.next = node3;
        head.next.prev = node2;

        Node node4 = new Node(40);
        head.next.next.next = node4;
        head.next.next.prev = node3;

        head.next.next.next.next = new Node(50);
        head.next.next.next.prev = node4;
    }
}
