package trees_questions;

import dataStructureImpl.trees.Node;

import java.util.ArrayList;
import java.util.List;

// find all the paths from leaf node to root:
public class LeafNodeToRootPath {

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

        List<String> result = new ArrayList<>();
        System.out.println(findLeafNodeToRootPath(rootNode, result, ""));
    }

    // find the all the paths from leaf node to root:
    public static List<String> findLeafNodeToRootPath(Node root, List<String> result, String s) {

        if (root == null) return result;
        if (root.leftNode == null && root.rightNode == null) {
            result.add(root.data + "->" + s);
            return result;
        }
        if (s.isEmpty()) {
            s = root.data + s;
        } else {
            s = root.data + "->" + s;
        }
        findLeafNodeToRootPath(root.leftNode, result, s);
        findLeafNodeToRootPath(root.rightNode, result, s);
        return result;
    }
}
