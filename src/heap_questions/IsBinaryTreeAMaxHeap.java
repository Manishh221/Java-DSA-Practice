package heap_questions;

import dataStructureImpl.trees.Node;

public class IsBinaryTreeAMaxHeap {

    public static void main(String[] args) {

        Node root = new Node(7);
        Node node1 = new Node(6);
        Node node2 = new Node(5);
        Node node3 = new Node(4);
        Node node4 = new Node(3);
        Node node6 = new Node(2);
        Node node7 = new Node(1);

        root.leftNode = node1;
        root.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;
        node2.leftNode = node6;
        node2.rightNode = node7;

        int size = size(root);

        System.out.println(isCBT(root, 1, size) && isMaxHeap(root));
    }

    public static Boolean isMaxHeap(Node root) {

        if (root == null) return true;

        int leftVal = (root.leftNode != null) ? root.leftNode.data : Integer.MIN_VALUE;
        int rightVal = (root.rightNode != null) ? root.rightNode.data : Integer.MIN_VALUE;

        if (root.data < leftVal || root.data < rightVal) return false;

        return isMaxHeap(root.leftNode) && isMaxHeap(root.rightNode);
    }

    public static Boolean isCBT(Node root, int number, int size) {
        if (root == null) return true;
        if (number > size) return false;
        return isCBT(root.leftNode, number * 2, size) && isCBT(root.rightNode, number * 2 + 1, size);
    }

    public static int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.leftNode) + size(root.rightNode);
    }
}
