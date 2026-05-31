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
public class CountOfNodes {
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
    // Count Nodes
    public int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }
    public static void main(String[] args) {

        int[] nodes = { 90, 80, 70, -1, -1, 85, -1, -1,100, 95, -1, -1, 110, -1, -1};
        CountOfNodes tree = new CountOfNodes();
        Node root = tree.buildTree(nodes);
        int totalNodes = tree.countNodes(root);
        System.out.println("Count = " + totalNodes);
    }
}