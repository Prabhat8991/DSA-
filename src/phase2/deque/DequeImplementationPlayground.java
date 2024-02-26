package phase2.deque;

public class DequeImplementationPlayground {

    public static void main(String[] args) {
        DequeArrayImplementation deque = new DequeArrayImplementation(5);
        deque.insertFront(10);
        deque.insertRear(50);
        System.out.println(deque.getFront());
        System.out.println(deque.getRear());
        deque.insertFront(20);
        System.out.println(deque.getFront());
        System.out.println(deque.getRear());




    }
}
