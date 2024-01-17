package phase2.linkedlist.doublylinkedlist;

import phase2.linkedlist.doublylinkedlist.Node;

import java.util.HashMap;
import java.util.Map;

import static phase2.linkedlist.Node.printLinkedList;
import static phase2.linkedlist.doublylinkedlist.Node.printDoublyLinkedList;

public class LruCache {
    /**
     * 1. Need a set to verify hit or miss
     * 2. Need a DoublyLinkedList for managing sequence
     */

    private Map<Integer, Node> cache = new HashMap<>();
    private Node head;
    private Node tail;

    private int count;

    private int capacity;

    public LruCache(int initialValue, int capacity) {
        Node node = new Node(initialValue);
        cache.put(initialValue, node);
        head = node;
        tail = node;
        this.capacity = capacity;
    }

    public void add(int value) {
        //check if present in map
        if (cache.containsKey(value)) {
            //make this node as the head if it is not the head
            Node node = cache.get(value);
            moveTheNodeToHeadPosition(node);
        } else {
            //put in the map and make this node as the head if he
            //and remove last node if capacity is reached.
            //increase count
            Node node = new Node(value);
            cache.put(value, node);
            insertNodeAtHeadPosition(node);
            count+=1;
            if (count >= capacity) {
                tail = tail.prev;
                tail.next = null;
                count-=1;
            }
        }
        System.out.println();
        printDoublyLinkedList(head);
        System.out.println();
    }

    private void moveTheNodeToHeadPosition(Node node) {
        if (tail == node && tail.prev != null) {
            tail = tail.prev;
            tail.next = null;
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
            return;
        }
        if (head != node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    private void insertNodeAtHeadPosition(Node node) {
           head.prev = node;
           node.next = head;
           head = node;
           node.prev = null;
    }
}
