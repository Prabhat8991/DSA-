package phase2.linkedlist;

public class FindIntersectionOfTwoLinkedList {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node node1 = new Node(2);
        head1.next = node1;
        Node node2 = new Node(3);
        node1.next = node2;
        Node node3 = new Node(4);
        node2.next = node3;
        Node node4 = new Node(5);
        node3.next = node4;
        Node node5 = new Node(6);
        node4.next = node5;

        Node head2 = new Node(10);
        Node node21 = new Node(20);
        head2.next = node21;

        node21.next = node3;

        System.out.println(getIntersectionNode(head1, head2).value);
    }

    private static Node getIntersectionNode(Node head1, Node head2) {
        //count nodes in both the linked lists
        int count1 = 0;
        int count2 = 0;

        Node currentNode = head1;

        while (currentNode != null) {
            currentNode = currentNode.next;
            count1+=1;
        }

        currentNode = head2;

        while (currentNode != null) {
            currentNode = currentNode.next;
            count2+=1;
        }

        int diff = Math.abs(count1-count2);

        Node leadingNode;
        Node trailingNode;

        if (count1 > count2) {
            leadingNode = head1;
            trailingNode = head2;
        } else {
            leadingNode = head2;
            trailingNode = head1;
        }

        Node currentNodeFromLeading = leadingNode;
        Node currentNodeFromTrailing = trailingNode;
        int count = 0;

        while (currentNodeFromLeading != null || currentNodeFromTrailing != null) {
            currentNodeFromLeading = currentNodeFromLeading.next;
            count+=1;

            if (count > diff) {
                currentNodeFromTrailing = currentNodeFromTrailing.next;
            }

            if (currentNodeFromLeading == currentNodeFromTrailing) {
                break;
            }
        }
        return currentNodeFromLeading;
    }
}
