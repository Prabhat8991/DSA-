package phase2.linkedlist;

public class Test {

    public static void main(String[] args) {
        Node node = null;
        Node node1 = new Node(20);
        node = node1;
        node.value = 30;
        System.out.println(node1.value);
    }
}
