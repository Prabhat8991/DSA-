package phase2.queue;

import phase2.linkedlist.Node;

public class QueueLinkedListImplementation {
    private Node head;
    private Node tail;

    public QueueLinkedListImplementation(int startValue) {
        head = new Node(startValue);
        tail = head;
    }

    public void enqueue(int value) {
        if (head == null) {
            head = new Node(value);
            tail = head;
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }

        head = head.next;
    }

    public int getFront() {
        if (head == null) {
            System.out.print("Queue is empty");
        }
        return head.value;
    }

}
