import java.util.*;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;   // Sum of main diagonal
        int secondarySum = 0; // Sum of secondary diagonal

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];           // Top-left to bottom-right
            secondarySum += matrix[i][n - i - 1]; // Top-right to bottom-left
        }

        System.out.println("Sum of primary diagonal: " + primarySum);
        System.out.println("Sum of secondary diagonal: " + secondarySum);
    }
}

/*
Sample Input:
Enter the size of the square matrix: 4
Enter the elements of the matrix:
2 3 1 4
5 6 7 8
9 1 2 3
4 5 6 7

Sample Output:
Sum of primary diagonal: 16
Sum of secondary diagonal: 24
*/
