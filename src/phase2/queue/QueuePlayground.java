package phase2.queue;

public class QueuePlayground {

    public static void main(String[] args) {
        QueueArrayImplementation queue = new QueueArrayImplementation(4);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.getFront());
        queue.dequeue();
        System.out.println(queue.getFront());
        queue.dequeue();
        System.out.println(queue.getFront());
        queue.dequeue();
        queue.dequeue();
    }
}
