package day12;
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class SumOfNodes {
    int idx = -1;
    public Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node root = new Node(nodes[idx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }
     // Sum of Nodes
    public int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);
        return leftSum + rightSum + root.data;
    }
    public static void main(String[] args) {
        int[] nodes = { 90, 80, 70, -1, -1, 85, -1, -1, 100, 95, -1, -1, 110, -1, -1};
        SumOfNodes tree = new SumOfNodes();
        Node root = tree.buildTree(nodes);
        int totalSum = tree.sumNodes(root);
        System.out.println("Sum of Nodes = " + totalSum);
    }
}
