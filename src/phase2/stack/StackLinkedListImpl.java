package phase2.stack;

import phase2.linkedlist.Node;

public class StackLinkedListImpl {
    private Node head;
    private int size;
    private int nodeCount;

    StackLinkedListImpl(int size, int initialValue) {
        this.size = size;
        head = new Node(initialValue);
    }

    public void push(int value) {
        if (nodeCount == size-1) {
            System.out.println("Limit reached....");
            return;
        }

        Node node = new Node(value);
        node.next = head;
        head = node;
        nodeCount+=1;
    }

    public int peek() {
        return head.value;
    }

    public int pop() {

        if (head.next == null) {
            System.out.print("Last element in the stack");
            return -1;
        }
        int result = head.value;
        head = head.next;
        nodeCount-=1;
        return result;
    }

    public int size() {
        return nodeCount;
    }
}
