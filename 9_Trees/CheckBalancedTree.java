// Java Program to Check if a Binary Tree is Balanced

import java.util.*;

// Node structure of a binary tree
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class CheckBalancedTree {
    TreeNode root;

    // Function to check height and balance simultaneously
    // Returns -1 if subtree is unbalanced
    int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1; // left subtree unbalanced

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1; // right subtree unbalanced

        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // current node unbalanced

        return Math.max(leftHeight, rightHeight) + 1; // return height
    }

    // Function to check if tree is balanced
    boolean isBalanced() {
        return checkHeight(root) != -1;
    }

    public static void main(String[] args) {
        CheckBalancedTree tree = new CheckBalancedTree();

        // Sample Balanced Tree
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        if (tree.isBalanced()) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is not balanced.");
        }

        // Sample Unbalanced Tree
        //        1
        //       /
        //      2
        //     /
        //    3
        CheckBalancedTree tree2 = new CheckBalancedTree();
        tree2.root = new TreeNode(1);
        tree2.root.left = new TreeNode(2);
        tree2.root.left.left = new TreeNode(3);

        if (tree2.isBalanced()) {
            System.out.println("The tree2 is balanced.");
        } else {
            System.out.println("The tree2 is not balanced.");
        }
    }
}

/*
Sample Input Trees:

Balanced Tree:
        1
       / \
      2   3
     / \
    4   5

Unbalanced Tree:
        1
       /
      2
     /
    3

Sample Output:
The tree is balanced.
The tree2 is not balanced.

Explanation:
- For a balanced tree, the height difference between left and right subtree of every node <= 1.
- For an unbalanced tree, at least one node has a height difference > 1.
*/
