// Java program to build a binary tree dynamically and find its height
import java.util.*;

class HeightOfTree {

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
            return null; // No node created
        }

        Node newNode = new Node(value);

        System.out.println("Enter left child of " + value);
        newNode.left = buildTree(sc);

        System.out.println("Enter right child of " + value);
        newNode.right = buildTree(sc);

        return newNode;
    }

    // Function to calculate height of tree
    static int height(Node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Build the binary tree:");
        Node root = buildTree(sc);

        int treeHeight = height(root);

        System.out.println("\nHeight of the Tree: " + treeHeight);

        sc.close();
    }
}

/*
================ Sample Input =================
We will construct the same tree with input: 4, 6, 1, 2, 8

            4
           / \
          6   1
         / \
        2   8

Inputs while running program:
Enter node value (-1 for no node): 4
Enter left child of 4
Enter node value (-1 for no node): 6
Enter left child of 6
Enter node value (-1 for no node): 2
Enter left child of 2
Enter node value (-1 for no node): -1
Enter right child of 2
Enter node value (-1 for no node): -1
Enter right child of 6
Enter node value (-1 for no node): 8
Enter left child of 8
Enter node value (-1 for no node): -1
Enter right child of 8
Enter node value (-1 for no node): -1
Enter right child of 4
Enter node value (-1 for no node): 1
Enter left child of 1
Enter node value (-1 for no node): -1
Enter right child of 1
Enter node value (-1 for no node): -1

================ Constructed Tree ================
            4
           / \
          6   1
         / \
        2   8

================ Sample Output =================
Height of the Tree: 3
*/
