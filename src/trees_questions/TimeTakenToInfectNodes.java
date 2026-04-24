package trees_questions;

import dataStructureImpl.trees.Node;

import java.util.*;

public class TimeTakenToInfectNodes {

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
        System.out.println(ammountOfTime(root, 1));
    }

    public static int ammountOfTime(Node root, int startingNode) {
        Node node = geteNode(root, startingNode);
        Map<Node, Node> parentChildMapping = new HashMap<>();
        preOrder(root, parentChildMapping);
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        Map<Node, Integer> isVisited = new HashMap<>();
        isVisited.put(node, 0);

        while (!queue.isEmpty()) {
            Node temp = queue.peek();
            int level = isVisited.get(temp);
            if (temp.leftNode != null && !isVisited.containsKey(temp.leftNode)) {
                queue.add(temp.leftNode);
                isVisited.put(temp.leftNode, level + 1);
            }
            if (temp.rightNode != null && !isVisited.containsKey(temp.rightNode)) {
                queue.add(temp.rightNode);
                isVisited.put(temp.rightNode, level + 1);
            }
            if (parentChildMapping.containsKey(temp) && !parentChildMapping.containsKey(parentChildMapping.get(temp))) {
                queue.add(parentChildMapping.get(temp));
                isVisited.put(parentChildMapping.get(temp), level + 1);
            }
            queue.remove();
        }

        int time = -1;
        for (int result : isVisited.values()) {
           time = Math.max(result, time);
            }

        return time;
    }

    private static void preOrder(Node root, Map<Node, Node> parentChildMapping) {
        if (root == null) return;
        if (root.leftNode != null) parentChildMapping.put(root.leftNode, root);
        if (root.rightNode != null) parentChildMapping.put(root.rightNode, root);
        preOrder(root.leftNode, parentChildMapping);
        preOrder(root.rightNode, parentChildMapping);
    }

    public static Node geteNode(Node root, int start) {
        if (root == null) return null;
        if (root.data == start) {
            return root;
        }
        Node left = geteNode(root.leftNode, start);
        Node right = geteNode(root.rightNode, start);

        if (left == null) return right;
        else return left;
    }
}
