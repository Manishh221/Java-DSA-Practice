package dataStructureImpl.trees;

public class Node {

    int data;

    Node leftNode;

    Node rightNode;

    public Node(int data) {
        this.data = data;
    }

    // display alll the child nodes of every nodes of the binary tree
    public static void preOrderTraversaldisplayChildNodes(Node root) {
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
    public static void preOrderTraversal(Node root) {
        if (root == null) return;


        preOrderTraversal(root.leftNode);
        preOrderTraversal(root.rightNode);
        System.out.println(root.data);
    }

    // find the size of the binary tree
    public static int sizeOfBinaryTree(Node root) {
        if (root == null) return 0;

        int leftSize = sizeOfBinaryTree(root.leftNode);
        int rightSize = sizeOfBinaryTree(root.rightNode);

        return leftSize + rightSize + 1;
    }

    // find the sum of the binary tree
    public static int findTheSumOfTreeNodes(Node root, int sum) {
        if (root == null) return 0;

        int leftSum = findTheSumOfTreeNodes(root.leftNode, sum);
        int rightSum = findTheSumOfTreeNodes(root.rightNode, sum);

        sum = root.data + leftSum + rightSum;
        return sum;
    }

    // find the Node with maximun value in the binary tree
    public static int findMax(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        int leftMax = findMax(root.leftNode);
        int rightMax = findMax(root.rightNode);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    // find of the height of binary tree
    public static int findHeight(Node root) {
        if (root == null) return 0;

        if (root.leftNode==null && root.rightNode==null) return 0;

        int leftMaxHeight = findHeight(root.leftNode);
        int rightMaxHeight = findHeight(root.rightNode);

        return 1 + Math.max(leftMaxHeight, rightMaxHeight);
    }

    // find min values in the binary tree:
    public static int findMinValue(Node root) {
        if (root == null) return Integer.MAX_VALUE;

        int leftMinVal = findMinValue(root.leftNode);
        int rightMinVal = findMinValue(root.rightNode);

        return Math.min(root.data, (Math.min(leftMinVal, rightMinVal)));
    }

    // find product of the tree
    public static int productOfTree(Node root){
        if (root==null) return 1;

        return root.data * productOfTree(root.leftNode) * productOfTree(root.rightNode);
    }
}
