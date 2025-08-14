import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample Input:
        // 4x4 matrix
        int n = 4;
        int[][] matrix = new int[n][n];

        System.out.println("Enter 16 elements of 4x4 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSpiral Order Traversal:");
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) System.out.print(matrix[top][i] + " ");
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) System.out.print(matrix[i][right] + " ");
            right--;

            // Print bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            // Print left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }
}

/*
Sample Input:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample Output:
Original Matrix:
1	2	3	4
5	6	7	8
9	10	11	12
13	14	15	16

Spiral Order Traversal:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
*/
