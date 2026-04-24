package trees_questions;

import dataStructureImpl.trees.Node;

import javax.crypto.spec.PSource;
// find the target sum from root to the leaf node:
public class PathSum {
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

        int targetSum = 12;

        System.out.println(checkSum(root, targetSum, 0));

    }

    public static boolean checkSum(Node root, int targetSum, int sum) {

        if (root == null) {
            return false;
        }
        sum += root.data;
        if (root.leftNode == null && root.rightNode == null) {
            return sum == targetSum;
        }

        return checkSum(root.leftNode, targetSum, sum) || checkSum(root.rightNode, targetSum, sum);
    }
}
