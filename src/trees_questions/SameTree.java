package trees_questions;


import dataStructureImpl.trees.Node;

// check the two trees are exactly same or not:
public class SameTree {
    public static void main(String[] args) {

        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        root.leftNode = node1;
        root.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;
        node2.leftNode = node6;
        node2.rightNode = node7;

        Node root2 = new Node(1);
        Node node8 = new Node(2);
        Node node9 = new Node(3);
        Node node10 = new Node(4);
        Node node11 = new Node(5);
        Node node12 = new Node(6);
        Node node13 = new Node(0);

        root2.leftNode = node8;
        root2.rightNode = node9;
        node8.leftNode = node10;
        node8.rightNode = node11;
        node9.leftNode = node12;
        node9.rightNode = node13;


        System.out.println(isSameTree(root, root2));

    }

    public static Boolean isSameTree(Node roo1, Node root2) {
        if (roo1 == null && root2 == null) return true;
        if (roo1 == null || root2 == null) return false;
        if (roo1.data != root2.data) return false; // VIMP
        return isSameTree(roo1.leftNode, root2.leftNode) && isSameTree(roo1.rightNode, root2.rightNode);
    }
}
