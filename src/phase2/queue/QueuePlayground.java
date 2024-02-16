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

        System.out.println("LinkedList implementation .......");

        QueueLinkedListImplementation queueLinkedListImplementation = new QueueLinkedListImplementation(10);
        queueLinkedListImplementation.enqueue(20);
        queueLinkedListImplementation.enqueue(30);

        System.out.println("Front " + queueLinkedListImplementation.getFront());
        queueLinkedListImplementation.dequeue();
        System.out.println("Front " + queueLinkedListImplementation.getFront());
        queueLinkedListImplementation.dequeue();
        System.out.println("Front " + queueLinkedListImplementation.getFront());
        queueLinkedListImplementation.dequeue();
        queueLinkedListImplementation.dequeue();
        queueLinkedListImplementation.enqueue(10);
        System.out.println("Front " + queueLinkedListImplementation.getFront());

    }
}
