package phase2.stack;

public class StackLinkedListImplPlayground {

    public static void main(String[] args) {
        StackLinkedListImpl stackLinkedList = new StackLinkedListImpl(5, 1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        System.out.println(stackLinkedList.peek());
        stackLinkedList.push(4);
        System.out.println(stackLinkedList.peek());
        stackLinkedList.push(5);
        stackLinkedList.push(6);
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.peek());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.size());
        System.out.println(stackLinkedList.pop());
    }
}
