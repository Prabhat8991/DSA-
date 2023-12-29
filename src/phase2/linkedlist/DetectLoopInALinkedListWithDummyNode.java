package phase2.linkedlist;

public class DetectLoopInALinkedListWithDummyNode {

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

        node4.next = node2; //loop
        System.out.println(isLoopInLinkedListPresent(head));
    }

    private static boolean isLoopInLinkedListPresent(Node head) {
        Node dummyNode = new Node(Integer.MAX_VALUE);

        Node currentNode = head;

        while (currentNode != null) {

            if (currentNode.next == dummyNode) {
                return true;
            }
            Node temp;
            temp = currentNode.next;
            currentNode.next = dummyNode;
            currentNode = temp;
        }
        return false;
    }
}
