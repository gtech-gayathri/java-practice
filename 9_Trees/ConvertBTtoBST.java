// Java Program to Convert Binary Tree to Binary Search Tree (BST)
// Using a simple array to store node values

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

class ConvertBTtoBST {
    TreeNode root;

    int[] inorderList = new int[100]; // stores tree node values
    int index = 0; // number of nodes stored

    // Step 1: Store inorder traversal of the tree in array
    void storeInorder(TreeNode node) {
        if (node == null) return;
        storeInorder(node.left);
        inorderList[index++] = node.data; // store node value
        storeInorder(node.right);
    }

    // Step 2: Sort the array
    void sortInorderList() {
        Arrays.sort(inorderList, 0, index); // sort only filled elements
    }

    int arrayIndex = 0; // to track position in sorted array

    // Step 3: Replace node values with sorted values (inorder)
    void arrayToBST(TreeNode node) {
        if (node == null) return;
        arrayToBST(node.left);
        node.data = inorderList[arrayIndex++];
        arrayToBST(node.right);
    }

    // Function to convert Binary Tree to BST
    void convertToBST() {
        storeInorder(root);
        sortInorderList();
        arrayIndex = 0; // reset before assigning
        arrayToBST(root);
    }

    // Function to perform inorder traversal
    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        ConvertBTtoBST tree = new ConvertBTtoBST();

        // Sample Binary Tree
        //        10
        //       /  \
        //     30    15
        //     / \
        //    20  5
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(30);
        tree.root.right = new TreeNode(15);
        tree.root.left.left = new TreeNode(20);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Inorder traversal of original tree:");
        tree.inorder(tree.root);

        // Convert to BST
        tree.convertToBST();

        System.out.println("\nInorder traversal of converted BST:");
        tree.inorder(tree.root);
    }
}

/*
Sample Input Tree:
        10
       /  \
     30    15
     / \
    20  5

Sample Output:

Inorder traversal of original tree:
20 30 5 10 15 

Original Tree Structure:
        10
       /  \
     30    15
     / \
    20  5

Inorder traversal of converted BST:
5 10 15 20 30 

Converted BST Structure:
        15
       /  \
     10    20
     / \
    5  30

Explanation of Conversion:

1. Step 1: Traverse the binary tree in inorder (Left → Root → Right) 
   and store values in array:
   Original inorder = 20 30 5 10 15

2. Step 2: Sort the array in ascending order to satisfy BST property:
   Sorted array = 5 10 15 20 30

3. Step 3: Assign sorted values back to nodes during inorder traversal:
   - First node in inorder (20) → 5
   - Next node (30) → 10
   - Next node (5) → 15
   - Next node (10) → 20
   - Last node (15) → 30

Resulting tree preserves the **original structure** but the node values satisfy BST properties. 
That’s why the root now has value 15 — it’s just the third value in sorted order assigned to the root during inorder traversal.
*/
