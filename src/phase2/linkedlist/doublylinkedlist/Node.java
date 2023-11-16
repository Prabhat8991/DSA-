package phase2.linkedlist.doublylinkedlist;

public class Node {

    Node prev;
    Node next;
    int value;

    Node (int value) {
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
