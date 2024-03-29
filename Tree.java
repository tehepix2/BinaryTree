public class Tree {
    private Node head;

    public Tree(Node head) {
        this.head = head;
    }

    public void printTree(Node head) {
        System.out.println(head.getName());
        if (head.getLeft() != null) {
            printTree(head.getLeft());
            printTree(head.getRight());
        }
    }

    public Node getHead() {
        return head;
    }
}
