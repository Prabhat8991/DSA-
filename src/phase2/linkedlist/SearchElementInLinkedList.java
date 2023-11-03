package phase2.linkedlist;

public class SearchElementInLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        int result = findElementInLinkedList(40, head, 0);
        System.out.println(result);
    }

    private static int findElementInLinkedList(int n, Node head, int index) {
        if (n == head.value) {
            return index;
        }

        if (head.next == null) {
            return -1;
        }
        return findElementInLinkedList(n, head.next, index+1);
    }

}
