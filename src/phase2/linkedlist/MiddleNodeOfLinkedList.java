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
        Node node5 = new Node(60);
        node4.next = node5;
        Node node6 = new Node(70);
        node5.next = node6;

        System.out.println(findMiddleNodeOfLinkedList(head).value);

    }

    private static Node findMiddleNodeOfLinkedList(Node head) {
       Node fastNode = head ;
       Node slowNode = head;

       int fastCounter = 0;

       while (fastNode != null) {
           fastNode = fastNode.next;
           fastCounter+=1;

           if (fastCounter % 2 == 0)
               slowNode = slowNode.next;
       }
       return slowNode;
    }
}

