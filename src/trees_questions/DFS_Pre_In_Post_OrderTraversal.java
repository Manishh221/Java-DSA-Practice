package trees_questions;

import dataStructureImpl.trees.Node;

public class DFS_Pre_In_Post_OrderTraversal {

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

    }

    // pre order traversal:
    public static void preOrderTraversal(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        preOrderTraversal(root.leftNode);
        preOrderTraversal(root.rightNode);
    }

    // in order traversal:
    public static void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.leftNode);
        System.out.println(root.data);
        inOrderTraversal(root.rightNode);
    }

    // post Order traversal:
    public static void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.leftNode);
        postOrderTraversal(root.rightNode);
        System.out.println(root.data);
    }
}
