package dataStructureImpl.trees;

public class Main {

    public static void main(String[] args) {
        Node root = new Node(1);
        Node root2 = new Node(2);
        Node root3 = new Node(3);
        Node root4 = new Node(4);
        Node root5 = new Node(5);
        Node root6 = new Node(6);
        Node root7 = new Node(7);

        root.leftNode = root2;
        root.rightNode = root3;
        root2.leftNode = root4;
        root2.rightNode = root5;
        root3.leftNode = root6;
        root3.rightNode = root7;

        root.levelOrderTraversal(root);

    }
}
