package trees_questions;

import dataStructureImpl.trees.Node;

public class SymmetricTree {
// symetric tree is the The left subtree should be a mirror image of the right subtree
    public static void main(String[] args) {

        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node6 = new Node(4);
        Node node7 = new Node(4);

        root.leftNode = node1;
        root.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;
        node2.leftNode = node6;
        node2.rightNode = node7;


        root.levelOrderTraversal(root);
        System.out.println(isSymmetric02(root.leftNode, root.rightNode));

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
