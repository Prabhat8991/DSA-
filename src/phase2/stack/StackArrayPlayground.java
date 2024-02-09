package phase2.stack;

public class StackArrayPlayground {
    public static void main(String[] args) {
        StackArrayImpl stackArray = new StackArrayImpl(5);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        System.out.println(stackArray.peek());
        stackArray.push(4);
        System.out.println(stackArray.peek());
        stackArray.push(5);
        stackArray.push(6);
        System.out.println(stackArray.pop());
        System.out.println(stackArray.peek());
        System.out.println(stackArray.pop());
        System.out.println(stackArray.size());
        System.out.println(stackArray.pop());
    }
}
