package trees_questions;

import dataStructureImpl.trees.Node;

import java.util.HashMap;

public class ConstructABinaryTreeWithPreAndInOrderLevelTraversal {
    public static void main(String[] args) {

        int preOrder[] = {1, 2, 4, 5, 3, 6};
        int inOrder[] = {4, 2, 5, 1, 3, 6};

    }
    public static Node buildTree(int[] preorder, int[] inorder,
                                 int preStart, int preEnd,
                                 int inStart, int inEnd) {
        // base case
        if (preStart > preEnd || inStart > inEnd) return null;

        // Step 1 - pick root from preorder
        Node root = new Node(preorder[preStart]);

        // Step 2 - find root in inorder
        int rootIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.data) {
                rootIndex = i;
                break;
            }
        }

        // Step 3 - count left subtree nodes
        int leftCount = rootIndex - inStart;

        // Step 4 - recurse left and right
        root.leftNode = buildTree(preorder, inorder,
                preStart + 1, preStart + leftCount,
                inStart, rootIndex - 1);

        root.rightNode = buildTree(preorder, inorder,
                preStart + leftCount + 1, preEnd,
                rootIndex + 1, inEnd);
        return root;
    }

    public static Node buildTree02(int[] preorder, int[] inorder) {
        // Step 1 - build hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);  // value → index
        }
        return build(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1, map);
    }

    public static Node build(int[] pre, int preStart, int preEnd,
                             int[] in, int inStart, int inEnd,
                             HashMap<Integer, Integer> map) {

        if (preStart > preEnd || inStart > inEnd) return null;

        // Step 2 - pick root
        Node root = new Node(pre[preStart]);

        // Step 3 - find root index in O(1)
        int rootIndex  = map.get(root.data);
        int leftCount  = rootIndex - inStart;

        // Step 4 - recurse
        root.leftNode  = build(pre, preStart + 1,
                preStart + leftCount,
                in, inStart,
                rootIndex - 1, map);

        root.rightNode = build(pre, preStart + leftCount + 1,
                preEnd,
                in, rootIndex + 1,
                inEnd, map);
        return root;
    }
}
