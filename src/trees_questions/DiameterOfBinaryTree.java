package trees_questions;

import dataStructureImpl.trees.Node;

public class DiameterOfBinaryTree {

    public static void main(String[] args) {

        Node root = new Node(1);
        Node root2 = new Node(2);
        Node root3 = new Node(3);
        Node root4 = new Node(4);
        Node root5 = new Node(5);
        Node root6 = new Node(6);
        Node root7 = new Node(7);

        root.leftNode = root2;
        root.rightNode = root3;
        root2.leftNode = root4;
        root2.rightNode = root5;
        root3.leftNode = root6;
        root3.rightNode = root7;

        System.out.println(diameterOfTheTree(root));
    }

    /*
     diameter is the Longest path between any two nodes in the tree -- we can solve by finding height of the left and right node's max height of the root.
     and diameter is calculated by on every node
     */
    public static int maxHeight(Node root) {
        if (root == null || root.leftNode==null && root.rightNode==null) return 0;  // height is counting as the edges so base case is valid if leaf node has no children then return 0
        int left = maxHeight(root.leftNode);
        int right = maxHeight(root.rightNode);
        return 1+ Math.max(left,right);
    }

    public static int diameterOfTheTree(Node root){
        if (root==null || root.leftNode==null && root.rightNode==null) return 0;
       int leftRoot = diameterOfTheTree(root.leftNode);
       int rightNode = diameterOfTheTree(root.rightNode);
       int mid = maxHeight(root.leftNode) + maxHeight(root.rightNode);
       if (root.leftNode!=null) mid++;
       if (root.rightNode!=null) mid++;
       int max = Math.max(mid, Math.max(leftRoot, rightNode));
       return max;
    }
}
