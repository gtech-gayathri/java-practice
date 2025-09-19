// Java Program for Zig-Zag Traversal of a Binary Tree

// Node structure of a binary tree
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class ZigZagTraversal {
    TreeNode root;

    // Function to get the height of the tree
    int height(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Function to print nodes at a given level in left-to-right or right-to-left
    void printLevel(TreeNode node, int level, boolean leftToRight) {
        if (node == null) return;

        if (level == 1) {
            System.out.print(node.data + " ");
        } else if (level > 1) {
            if (leftToRight) {
                printLevel(node.left, level - 1, leftToRight);
                printLevel(node.right, level - 1, leftToRight);
            } else {
                printLevel(node.right, level - 1, leftToRight);
                printLevel(node.left, level - 1, leftToRight);
            }
        }
    }

    // Zig-Zag traversal
    void zigZagTraversal(TreeNode node) {
        int h = height(node);
        boolean leftToRight = true;

        for (int i = 1; i <= h; i++) {
            printLevel(node, i, leftToRight);
            leftToRight = !leftToRight; // toggle direction for next level
        }
    }

    public static void main(String[] args) {
        ZigZagTraversal tree = new ZigZagTraversal();

        // Sample Tree
        //        1
        //       / \
        //      2   3
        //     / \  / \
        //    4  5 6  7
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);

        System.out.println("Zig-Zag Traversal of the tree:");
        tree.zigZagTraversal(tree.root);
    }
}

/*
Sample Input Tree:
        1
       / \
      2   3
     / \  / \
    4  5 6  7

Sample Output:
Zig-Zag Traversal of the tree:
1 3 2 4 5 6 7

Explanation:
- Level 1: left to right → 1
- Level 2: right to left → 3 2
- Level 3: left to right → 4 5 6 7

How it works:
1. Find the height of the tree.
2. For each level, recursively print nodes.
3. Alternate the order for each level (left-to-right or right-to-left).
*/
