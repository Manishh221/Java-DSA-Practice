package trees_questions;

import dataStructureImpl.trees.Node;

import java.util.ArrayList;
import java.util.List;

public class ZigZagLevelOrderTraversal {

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

        List<List<Integer>> result = new ArrayList<>();

        int k = root.findHeight(root)+1; // because the height method is finding the height on the basis of edges there we have to ass 1 with the height method:

        for (int i = 1; i <= k; i++) {
            ArrayList<Integer> ans = new ArrayList<>();
            if (i % 2 == 0) {
                result.add(zigZagLevelOrderTraversalLeftToRight(root, ans, i));
            } else {
                result.add(zigZagLevelOrderTraversalRightToLeft(root, ans , i));
            }
        }

        System.out.println(result);
    }

    public static List<Integer> zigZagLevelOrderTraversalLeftToRight(Node root, ArrayList<Integer> ans, int k) {
        if (root == null) return ans;
        if (k == 1) {
            ans.add(root.data);
        }
        zigZagLevelOrderTraversalLeftToRight(root.rightNode, ans, k - 1);
        zigZagLevelOrderTraversalLeftToRight(root.leftNode, ans, k - 1);
        return ans;
    }
    public static List<Integer> zigZagLevelOrderTraversalRightToLeft(Node root, ArrayList<Integer> ans, int k) {
        if (root == null) return ans;
        if (k == 1) {
            ans.add(root.data);
        }
        zigZagLevelOrderTraversalRightToLeft(root.leftNode, ans, k - 1);
        zigZagLevelOrderTraversalRightToLeft(root.rightNode, ans, k - 1);
        return ans;
    }
}
