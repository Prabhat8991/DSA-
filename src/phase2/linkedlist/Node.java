package phase2.linkedlist;

public class Node {
    public int value;
    public Node next;

    public Node(int x) {
        value = x;
        next = null;
    }

    public static void main(String[] args) {
        Node linkedList = new Node(10);
        linkedList.next = new Node(20);
        linkedList.next.next = new Node(30);
        linkedList.next.next.next = new Node(40);
        printLinkedList(linkedList);
    }

    public static void printLinkedList(Node linkedList) {

        if (linkedList == null) {
            return;
        }
        System.out.println(linkedList.value);

        printLinkedList(linkedList.next);
    }
}
