package phase2.linkedlist;

public class NthNodeFromEndOfLinkedList {

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

        System.out.println(nthNodeFromEndOfLinkedList(head, 4).value);
    }

    private static Node nthNodeFromEndOfLinkedList(Node head, int n) {
        int counter = 0;
        Node currentNode = head;
        Node trackerNode = head;

        while (currentNode != null && currentNode.next != null) {
            currentNode = currentNode.next;
            counter++;
            if (counter > n-1) {
                trackerNode = trackerNode.next;
            }
        }
        return trackerNode;
    }
}
