package phase2.queue;

public class QueueArrayImplementation {

    int [] array;
    int front = 0;

    int rear = 0;

    int size;

    QueueArrayImplementation(int size) {
        this.size = size;
        array = new int[size];
    }

    public void enqueue(int value) {
        array[rear] = value;
        rear+=1;
    }

    public int dequeue() {
      //Move element to left
        if (rear == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        shiftLeft(array);
        rear-=1;
        System.out.println("rear " + rear);
        return array[front];
    }

    public int getFront() {
        if (rear == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return array[front];
    }
    private void shiftLeft(int [] array) {
        for (int i = 0; i < array.length-1; i++) {
           array[i] = array[i+1];
        }
    }

}

