package heap_questions;

import dataStructureImpl.trees.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class BSTToMaxHeap {
    public static void main(String[] args) {

        Node root = new Node(7);
        Node node1 = new Node(3);
        Node node2 = new Node(6);
        Node node3 = new Node(1);
        Node node4 = new Node(2);
        Node node6 = new Node(4);
        Node node7 = new Node(5);

        root.leftNode = node1;
        root.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;
        node2.leftNode = node6;
        node2.rightNode = node7;

        int idx = 0;
        ArrayList<Integer> inOrder = new ArrayList<>();
        inorderRoot(root, inOrder);
        postOrderMaxHeap(root, inOrder, idx);
        root.preOrderTraversal(root);
    }

    private static int postOrderMaxHeap(Node root, ArrayList<Integer> inOrder, int idx) {
        if (root == null) return idx;
        if (idx >= inOrder.size()) return idx;

        idx = postOrderMaxHeap(root.leftNode, inOrder, idx);
        idx = postOrderMaxHeap(root.rightNode, inOrder, idx);
        root.data = inOrder.get(idx);
        idx++;
        return idx;
    }

    private static void inorderRoot(Node root, ArrayList<Integer> inOrder) {
        if (root == null) return;
        inorderRoot(root.leftNode, inOrder);
        inOrder.add(root.data);
        inorderRoot(root.rightNode, inOrder);
    }
}
