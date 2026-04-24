package trees_questions;

import dataStructureImpl.trees.Node;

import javax.swing.tree.TreeNode;

public class FlattenBinaryTreeToLinkedList {

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

    private static void flattenHelper(Node root) {
        if (root == null) return;
        Node left = root.leftNode;
        Node right = root.rightNode;

        flattenHelper(left);
        flattenHelper(right);

        root.rightNode = left;
        root.leftNode = null;
        Node temp = left;

        while(temp!=null && temp.rightNode !=null){
            temp = temp.rightNode;
        }
        if (temp!=null) temp.rightNode = right;
        else{
            root.rightNode = right;
        }
    }

    // iterative approach with O(1) space, better approach
    public static void flatten(Node root) {
        Node curr = root;
        while (curr != null) {
            if (curr.leftNode != null) {
                Node rightmost = curr.leftNode;
                while (rightmost.rightNode != null) {
                    rightmost = rightmost.rightNode;
                }
                rightmost.rightNode = curr.rightNode;
                curr.rightNode = curr.leftNode;
                curr.leftNode = null;
            }
            curr = curr.rightNode;
        }
    }
}
