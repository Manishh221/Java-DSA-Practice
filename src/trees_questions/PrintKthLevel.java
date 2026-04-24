package trees_questions;

import dataStructureImpl.trees.Node;

public class PrintKthLevel {

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

        int k = 3;

        printKthLevel(root,k);
    }

    // find elements of Kth level
    public static void printKthLevel(Node root, int k) {
        if (root == null) return;
        if (k == 1) {
            System.out.print(root.data + " ");
            return;
        }
        printKthLevel(root.leftNode, k - 1);
        printKthLevel(root.rightNode, k - 1);
    }
}