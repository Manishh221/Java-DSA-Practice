package trees_questions;

import dataStructureImpl.trees.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

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

        bfs(root);

    }


    // find level order traversal (BFS) using queue DS
    public  static void bfs(Node root) {   // iterative way to level order traversal:
        Queue<Node> queue = new LinkedList<>();
        if (root != null) queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.peek();
            if (node.leftNode != null) queue.add(node.leftNode);
            if (node.rightNode != null) queue.add(node.rightNode);
            System.out.print(queue.poll().data + " ");
        }
    }
}
