package trees_questions;

import dataStructureImpl.trees.Node;

import java.util.ArrayList;
import java.util.List;

/*
very famous interview problem:
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
        Node node = new Node();

        List<String> result = new ArrayList<>();
        System.out.println(lowestCommonAncestor(rootNode, result, ""));
    }

    public static List<String> lowestCommonAncestor(Node root, List<String> result, String str) {
        if (root == null) return result;

        if (root.leftNode == null && root.rightNode == null) {
            result.add( str + root.data);
            return result;
        }
        str += root.data + "->";
        result = lowestCommonAncestor(root.leftNode, result, str);
        result = lowestCommonAncestor(root.rightNode, result, str);
        return result;
    }
}
