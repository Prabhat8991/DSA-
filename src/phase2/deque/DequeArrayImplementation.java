package phase2.deque;

public class DequeArrayImplementation {

    private int [] array;

    private int size = 0;

    private int front = 0;

    private int capacity = 0;

    DequeArrayImplementation(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
    }

    public void insertFront(int value) {
        front = (front - 1 + capacity)%capacity;
        array[front] = value;
        size++;
    }

    public void removeFront() {
        front = (front + 1)%capacity;
        size--;
    }

    public void insertRear(int value) {
        //because array[((front + size -1 + 1)% capacity)] = value;  +1 and -1 cancels out
        array[((front + size)% capacity)] = value;
        size++;
    }

    public void removeRear() {
        if (size == 0) {
            return;
        }
        size--;
    }

    public int getFront() {
        return array[front];
    }

    public int getRear() {
        if (size == 0) {
            return -1;
        }
        return array[(front + size -1)% capacity];
    }
}
