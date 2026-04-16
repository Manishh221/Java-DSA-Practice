package trees_questions;

import dataStructureImpl.trees.Node;

import java.util.ArrayList;
import java.util.List;

/*
very famous interview problem: find the lowest common Ancestor in the binary tree
 */
public class LowestCommonAncestor {

    public static void main(String[] args) {

        Node rootNode = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node6 = new Node(6);

        rootNode.leftNode = node1;
        rootNode.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;
        node2.rightNode = node6;

        System.out.println(findLowestCommonAncestor(rootNode, node3, node4).data);
    }

    // finding the lowest common ancestor for the nodes
    public static Node findLowestCommonAncestor(Node rootNode, Node p, Node q) {

        if (rootNode == p || rootNode == q) return rootNode;
        if (p == q) return p;

        Boolean leftP = isContains(rootNode.leftNode, p);
        Boolean rightQ = isContains(rootNode.rightNode, q);

        if (leftP && rightQ) return rootNode;
        if (leftP && !rightQ) return findLowestCommonAncestor(rootNode.leftNode, p, q);
        if (!leftP && rightQ) return findLowestCommonAncestor(rootNode.rightNode, p, q);
        if (!rightQ && !leftP) return rootNode;
        return null;
    }

    public static Boolean isContains(Node root, Node node) {
        if (root == null) return false;
        if (root == node) return true;
        return isContains(root.leftNode, node) || isContains(root.rightNode, node);
    }
}
