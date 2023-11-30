package phase2.linkedlist.doublylinkedlist;

public class Node {

    public Node prev;
    public Node next;
    public int value;

    public Node(int value) {
        this.value = value;
        prev = null;
        next = null;
    }


    public static void printDoublyLinkedList(Node linkedList) {

        if (linkedList == null) {
            return;
        }
        System.out.println(linkedList.value);

        printDoublyLinkedList(linkedList.next);
    }
}
