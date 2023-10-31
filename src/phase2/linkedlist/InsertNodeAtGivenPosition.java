package phase2.linkedlist;

import static phase2.linkedlist.Node.printLinkedList;

public class InsertNodeAtGivenPosition {
    public static void main(String[] args) {
        Node linkedList = new Node(10);
        linkedList.next = new Node(20);
        linkedList.next.next = new Node(30);
        linkedList.next.next.next = new Node(40);

        printLinkedList(linkedList);
        System.out.println("After Inserting........");

        //Insert at third position
        insertAtPosition(3, linkedList, new Node(50));

        printLinkedList(linkedList);
    }

    private static void  insertAtPosition(int n, Node linkedList, Node newNode) {
        int counter = 0;
        Node node = linkedList;
        while(counter < n-2) {
           node = linkedList.next;
           counter++;
        }
        Node temp = node.next;
        node.next = newNode;
        newNode.next = temp;
    }

}
