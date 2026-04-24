package trees_questions;

import dataStructureImpl.trees.Node;

public class SymmetricTree {

    public static void main(String[] args) {

        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node6 = new Node(4);
        Node node7 = new Node(3);

        root.leftNode = node1;
        root.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;
        node2.leftNode = node6;
        node2.rightNode = node7;

        root.leftNode = invertSubTree(root.rightNode);
        root.levelOrderTraversal(root);
        System.out.println(isSymmetric(root.leftNode, root.rightNode));

    }

    public static Node invertSubTree(Node root) {
        if (root == null) return root;
        invertSubTree(root.leftNode);
        invertSubTree(root.rightNode);
        Node temp = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = temp;

        return root;
    }

    public static Boolean isSymmetric(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.data != root2.data) return false;
        return isSymmetric(root1.leftNode, root2.leftNode) && isSymmetric(root1.rightNode, root2.rightNode);
    }

    // not need to invert subTree.... better approach
    public static Boolean isSymmetric02(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.data != root2.data) return false;
        return isSymmetric02(root1.leftNode, root2.rightNode) &&  // cross
                isSymmetric02(root1.rightNode, root2.leftNode);    // cross
    }

}
