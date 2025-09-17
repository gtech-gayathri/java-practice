// and perform Inorder, Preorder, and Postorder traversals

import java.util.Scanner;

class TreeTraversal {

    // Node structure for the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Build tree dynamically using recursion
    static Node buildTree(Scanner sc) {
        System.out.print("Enter node value (-1 for no node): ");
        int value = sc.nextInt();

        if (value == -1) {
            return null; // No node here
        }

        Node newNode = new Node(value);
        System.out.println("Enter left child of " + value);
        newNode.left = buildTree(sc);   // Recursively build left subtree

        System.out.println("Enter right child of " + value);
        newNode.right = buildTree(sc);  // Recursively build right subtree

        return newNode;
    }

    // Preorder Traversal (Root -> Left -> Right)
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal (Left -> Root -> Right)
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Build the binary tree:");
        Node root = buildTree(sc);

        System.out.println("\nPreorder Traversal:");
        preorder(root);

        System.out.println("\nInorder Traversal:");
        inorder(root);

        System.out.println("\nPostorder Traversal:");
        postorder(root);

        sc.close();
    }
}

/*
================ Sample Input =================
Enter node value (-1 for no node): 1
Enter left child of 1
Enter node value (-1 for no node): 2
Enter left child of 2
Enter node value (-1 for no node): 4
Enter left child of 4
Enter node value (-1 for no node): -1
Enter right child of 4
Enter node value (-1 for no node): -1
Enter right child of 2
Enter node value (-1 for no node): 5
Enter left child of 5
Enter node value (-1 for no node): -1
Enter right child of 5
Enter node value (-1 for no node): -1
Enter right child of 1
Enter node value (-1 for no node): 3
Enter left child of 3
Enter node value (-1 for no node): -1
Enter right child of 3
Enter node value (-1 for no node): -1

================ Constructed Tree ================
            1
           / \
          2   3
         / \
        4   5

================ Sample Output =================
Preorder Traversal:
1 2 4 5 3
Inorder Traversal:
4 2 5 1 3
Postorder Traversal:
4 5 2 3 1
*/
