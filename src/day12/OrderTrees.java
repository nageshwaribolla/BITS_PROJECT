package day12;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class OrderTrees {

    int idx = -1;

    // Build Tree
    public Node buildtree(int[] nodes) {
        idx++;

        if (nodes[idx] == -1) {
            return null;
        }

        Node root = new Node(nodes[idx]);

        root.left = buildtree(nodes);
        root.right = buildtree(nodes);

        return root;
    }

    // Preorder Traversal (Root Left Right)
    public void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal (Left Root Right)
    public void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder Traversal (Left Right Root)
    public void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        int[] nodes = {
            90, 80, 70, -1, -1, 85, -1, -1,
            100, 95, -1, -1, 110, -1, -1
        };

        OrderTrees tree = new OrderTrees();

        Node root = tree.buildtree(nodes);

        System.out.println("Root Node: " + root.data);

        System.out.print("Preorder: ");
        tree.preorder(root);

        System.out.print("\nInorder: ");
        tree.inorder(root);

        System.out.print("\nPostorder: ");
        tree.postorder(root);
    }
}
