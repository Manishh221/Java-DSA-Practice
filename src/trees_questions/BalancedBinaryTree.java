package trees_questions;

import dataStructureImpl.trees.Node;

public class BalancedBinaryTree {
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

        System.out.println(isBalanced(root));
    }

    public static int height(Node root) {
        if (root == null || root.leftNode == null && root.rightNode == null) return 0;
        int leftHeight = height(root.leftNode);
        int rightHeight = height(root.rightNode);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static Boolean isBalanced(Node root) {

        if (root == null) return true;
        int left = height(root.leftNode);
        if (root.leftNode != null) left++;
        int right = height(root.rightNode);
        if (root.rightNode != null) right++;
        int dif = Math.abs(left - right);

        if (dif > 1) {
            return false;
        }
        return isBalanced(root.leftNode) && isBalanced(root.rightNode);
    }

    // Optimized - returns -1 if not balanced, else returns height
    public static int checkBalanced(Node root) {
        if (root == null) return 0;
        int left  = checkBalanced(root.leftNode);
        int right = checkBalanced(root.rightNode);
        if (left == -1 || right == -1) return -1;    // already unbalanced
        if (Math.abs(left - right) > 1) return -1;   // current unbalanced
        return 1 + Math.max(left, right);
    }
// if result == -1 → not balanced ❌
// if result != -1 → balanced ✅
}
