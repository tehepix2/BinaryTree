class Main {
    public static void main(String[] args) {
        
        Node node7 = new Node("Michelle", null, null);
        Node node6 = new Node("Joe", null, null);
        Node node5 = new Node("Stacy", null, null);
        Node node4 = new Node("Ben", null, null);
        Node node3 = new Node("Charlie", node6, node7);
        Node node2 = new Node("Mary", node4, node5);
        Node head = new Node("Charles", node2, node3);
        Tree bTree = new Tree(head);
        bTree.printTree(bTree.getHead());
    }
}