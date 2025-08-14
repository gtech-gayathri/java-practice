import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of first matrix
        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        // Input size of second matrix
        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        // Multiplication possible only if c1 == r2
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] result = new int[r1][c2];

        // Input first matrix
        System.out.println("Enter first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print result
        System.out.println("Product of matrices:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

/*
Sample Input:
Enter rows of first matrix: 2
Enter columns of first matrix: 3
Enter rows of second matrix: 3
Enter columns of second matrix: 2
Enter first matrix:
1 2 3
4 5 6
Enter second matrix:
7 8
9 10
11 12

Sample Output:
Product of matrices:
58 64
139 154
*/
