package phase3.tree;

public class PostOrderTraversal {

    //InOrder: root left right: 40, 50, 20, 60, 70, 30, 10

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);

        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        postOrderTraversal(root);

    }

    private static void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.value);
        }
    }
}
