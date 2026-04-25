package trees_questions;

import dataStructureImpl.trees.Node;

public class InvertBinaryTree {

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

        Node temp = invertedBinaryTree(root);

        root.levelOrderTraversal(temp);

    }

    public static Node invertedBinaryTree(Node root){
        if (root==null) return root;
        invertedBinaryTree(root.leftNode);
        invertedBinaryTree(root.rightNode);
        Node temp = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = temp;
        return root;
    }
}
