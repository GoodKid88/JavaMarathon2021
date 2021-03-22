package day18;

public class Task3 {
    public static void main(String[] args) {
        Node node = new Node(20, null);

        node.Add(14);
        node.Add(23);
        node.Add(16);
        node.Add(11);
        node.Add(5);
        node.Add(8);
        node.Add(15);
        node.Add(18);
        node.Add(22);
        node.Add(27);
        node.Add(24);
        node.Add(150);

        node.dfs(node);
    }
}