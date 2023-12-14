package phase2.linkedlist;

public class MiddleNodeOfLinkedList {

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

        System.out.println(findMiddleNodeOfLinkedList(head).value);

    }

    private static Node findMiddleNodeOfLinkedList(Node head) {
       Node fastNode = head ;
       Node slowNode = head;

       while (fastNode != null && fastNode.next != null) {
           fastNode = fastNode.next.next;
           slowNode = slowNode.next;
       }
       return slowNode;
    }
}

