// Level Order Traversal of Binary Tree with user input

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTreeQueueBased {
    Node root;

    // Function to build tree from level-order input
    void buildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter root value (-1 for null): ");
        int val = sc.nextInt();
        if (val == -1) {
            root = null;
            return;
        }
        root = new Node(val);

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            System.out.print("Enter left child of " + current.data + " (-1 for null): ");
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                current.left = new Node(leftVal);
                queue.offer(current.left);
            }

            System.out.print("Enter right child of " + current.data + " (-1 for null): ");
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                current.right = new Node(rightVal);
                queue.offer(current.right);
            }
        }
    }

    // Level Order Traversal
    void levelOrder() {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        System.out.print("Level Order Traversal: ");
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryTreeUserInput tree = new BinaryTreeUserInput();
        tree.buildTree();
        tree.levelOrder();
    }
}

/*
Sample Input/Output:

Enter root value (-1 for null): 1
Enter left child of 1 (-1 for null): 2
Enter right child of 1 (-1 for null): 3
Enter left child of 2 (-1 for null): 4
Enter right child of 2 (-1 for null): 5
Enter left child of 3 (-1 for null): 6
Enter right child of 3 (-1 for null): 7
Enter left child of 4 (-1 for null): -1
Enter right child of 4 (-1 for null): -1
... (all remaining children as -1)

Output:
Level Order Traversal: 1 2 3 4 5 6 7
*/
