// Java Program to find the Mirror of a Binary Tree

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

class MirrorOfTree {  // Renamed class

    TreeNode root;

    // Function to mirror the binary tree
    void mirror(TreeNode node) {
        if (node == null)
            return;

        // Swap left and right children
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        // Recursively mirror left and right subtrees
        mirror(node.left);
        mirror(node.right);
    }

    // Function to perform inorder traversal
    void inorder(TreeNode node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        MirrorOfTree tree = new MirrorOfTree(); // Updated reference

        // Creating a sample tree
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

        System.out.println("Inorder traversal of original tree:");
        tree.inorder(tree.root);

        // Mirror the tree
        tree.mirror(tree.root);

        System.out.println("\nInorder traversal of mirrored tree:");
        tree.inorder(tree.root);
    }
}

/*
Sample Input Tree:
        1
       / \
      2   3
     / \
    4   5

Sample Output:

Inorder traversal of original tree:
4 2 5 1 3 

Original Tree Structure:
        1
       / \
      2   3
     / \
    4   5

Inorder traversal of mirrored tree:
3 1 5 2 4 

Mirrored Tree Structure:
        1
       / \
      3   2
         / \
        5   4
*/
