import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample Input:
        // 3x3 Matrix
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        System.out.println("\nMatrix after 90° rotation:");
        int[][] rot90 = rotate90(matrix);
        printMatrix(rot90);

        System.out.println("\nMatrix after 180° rotation:");
        int[][] rot180 = rotate180(matrix);
        printMatrix(rot180);

        System.out.println("\nMatrix after 270° rotation:");
        int[][] rot270 = rotate270(matrix);
        printMatrix(rot270);
    }

    // Function to rotate 90° clockwise
    public static int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[j][n - 1 - i] = mat[i][j];
            }
        }
        return res;
    }

    // Function to rotate 180°
    public static int[][] rotate180(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[n - 1 - i][m - 1 - j] = mat[i][j];
            }
        }
        return res;
    }

    // Function to rotate 270° clockwise (or 90° counterclockwise)
    public static int[][] rotate270(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[m - 1 - j][i] = mat[i][j];
            }
        }
        return res;
    }

    // Function to print matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}

/*
Sample Input:
Enter number of rows: 3
Enter number of columns: 3
Enter the elements of the matrix:
1 2 3
4 5 6
7 8 9

Sample Output:
Original Matrix:
1	2	3
4	5	6
7	8	9

Matrix after 90° rotation:
7	4	1
8	5	2
9	6	3

Matrix after 180° rotation:
9	8	7
6	5	4
3	2	1

Matrix after 270° rotation:
3	6	9
2	5	8
1	4	7
*/
