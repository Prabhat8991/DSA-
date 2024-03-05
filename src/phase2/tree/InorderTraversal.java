package phase2.tree;

public class InorderTraversal {

    //InOrder: left root right: 40, 20, 50, 10, 60, 30, 70

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);

        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        inorderTraversal(root);

    }

    private static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println(root.value);
            inorderTraversal(root.right);
        }
    }
}
