package day18;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private Node root;

    public Node(int value, Node root) {
        this.value = value;
        this.root = root;
    }

    @Override
    public String toString() {
        return value + " ";
    }

    public void Add(int value) {
        if (root == null) {
            root = this;
        }
        if (value >= this.value) {
            if (right == null) {
                right = new Node(value, this);
            } else {
                right.Add(value);
            }
        } else {
            if (value < this.value) {
                if (left == null) {
                    left = new Node(value, this);
                } else {
                    left.Add(value);
                }
            }
        }
    }

    public void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        System.out.print(node.toString());
        dfs(node.right);

    }
}

