package phase2.stack;

public class StackArrayImpl {

    private int size = 0;
    private int top = 0;

    private int[] array;

    public StackArrayImpl(int size) {
        this.size = size;
        array = new int[size];
    }

    public void push(int value) {
        if (top == array.length) {
            System.out.println("Maximum limit reached");
            return;
        }
        array[top] = value;
        top += 1;
    }

    public int size() {
        return top + 1;
    }

    public int peek() {
        return array[top-1];
    }

    public int pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        int result = array[top-1];
        top -= 1;
        return result;
    }

}
