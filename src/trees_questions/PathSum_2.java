package trees_questions;

import dataStructureImpl.trees.Node;

import java.util.ArrayList;
import java.util.List;

public class PathSum_2 {

    public static void main(String[] args) {
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node6 = new Node(4);
        Node node7 = new Node(6);

        root.leftNode = node1;
        root.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;
        node2.leftNode = node6;
        node2.rightNode = node7;

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int target = 8;

        System.out.println(findAllPathSum(root, target, 0, result, path));
    }

    public static List<List<Integer>> findAllPathSum(Node root, int target, int sum, List<List<Integer>> result, List<Integer> path) {

        if (root == null) return result;

        sum += root.data;
        path.add(root.data);

        if (root.leftNode == null && root.rightNode == null) {
            if (sum == target) {
                result.add(new ArrayList<>(path));
            }
        }

        findAllPathSum(root.leftNode, target, sum, result, path);
        findAllPathSum(root.rightNode, target, sum, result, path);
        path.remove(path.size()-1);
        return result;
    }
}
