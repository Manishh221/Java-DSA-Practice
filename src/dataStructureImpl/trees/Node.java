package dataStructureImpl.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Node {

    public int data;

    public Node leftNode;

    public Node rightNode;

    public Node(int data) {
        this.data = data;
    }
    public Node(){}

    // display alll the child nodes of every nodes of the binary tree
    public void preOrderTraversaldisplayChildNodes(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " -> ");

        if (root.leftNode != null) {
            System.out.print(root.leftNode.data + ", ");
        }
        if (root.rightNode != null) {
            System.out.print(root.rightNode.data + ", ");
        }
        System.out.println();
        preOrderTraversaldisplayChildNodes(root.leftNode);
        preOrderTraversaldisplayChildNodes(root.rightNode);
    }

    // Traveling each and every Node preOrder inn the binary tree:
    public void preOrderTraversal(Node root) {
        if (root == null) return;

        preOrderTraversal(root.leftNode);
        preOrderTraversal(root.rightNode);
        System.out.println(root.data);
    }

    // Traveling each and every Node inOrder inn the binary tree:
    public void inOrderTraversal(Node root) {
        if (root == null) return;

        inOrderTraversal(root.leftNode);
        System.out.println(root.data);
        inOrderTraversal(root.rightNode);
    }

    // Traveling each and every Node postOrder inn the binary tree:
    public void postOrderTraversal(Node root) {
        if (root == null) return;

        postOrderTraversal(root.leftNode);
        postOrderTraversal(root.rightNode);
        System.out.println(root.data);
    }

    // find the size of the binary tree
    public int sizeOfBinaryTree(Node root) {
        if (root == null) return 0;

        int leftSize = sizeOfBinaryTree(root.leftNode);
        int rightSize = sizeOfBinaryTree(root.rightNode);

        return leftSize + rightSize + 1;
    }

    // find the sum of the binary tree
    public int findTheSumOfTreeNodes(Node root, int sum) {
        if (root == null) return 0;

        int leftSum = findTheSumOfTreeNodes(root.leftNode, sum);
        int rightSum = findTheSumOfTreeNodes(root.rightNode, sum);

        sum = root.data + leftSum + rightSum;
        return sum;
    }

    // find the Node with maximun value in the binary tree
    public int findMax(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        int leftMax = findMax(root.leftNode);
        int rightMax = findMax(root.rightNode);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    // find of the height of binary tree
    public int findHeight(Node root) {
        if (root == null) return 0;

        if (root.leftNode == null && root.rightNode == null) return 0;

        int leftMaxHeight = findHeight(root.leftNode);
        int rightMaxHeight = findHeight(root.rightNode);

        return 1 + Math.max(leftMaxHeight, rightMaxHeight);
    }

    // find min values in the binary tree:
    public int findMinValue(Node root) {
        if (root == null) return Integer.MAX_VALUE;

        int leftMinVal = findMinValue(root.leftNode);
        int rightMinVal = findMinValue(root.rightNode);

        return Math.min(root.data, (Math.min(leftMinVal, rightMinVal)));
    }

    // find product of the tree
    public int productOfTree(Node root) {
        if (root == null) return 1;
        return root.data * productOfTree(root.leftNode) * productOfTree(root.rightNode);
    }

    // find elements of Kth level
    public void printKthLevel(Node root, int k) {
        if (root == null) return;
        if (k == 1) {
            System.out.print(root.data + " ");
            return;
        }
        printKthLevel(root.leftNode, k - 1);
        printKthLevel(root.rightNode, k - 1);
    }

    // find elements by level order traversal using foor loop and t.c. O(n)
    public void printLevelsUsingForLoop(Node root, int height) {
        for (int i = 1; i <= height + 1; i++) {
            root.printKthLevel(root, i);
            System.out.println();
        }
    }

    // find level order traversal (BFS) using queue DS
    public void bfs(Node root) {   // iterative way to level order traversal:
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
