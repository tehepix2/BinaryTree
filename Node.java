public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name, Node left, Node right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public String getName() {
        return name;
    }
}
