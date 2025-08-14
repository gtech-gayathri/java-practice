import java.util.*;

public class RightAlignedDescendingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int cell = String.valueOf(n).length() + 2; // fixed cell width for alignment

        for (int i = 1; i <= n; i++) {
            // Left padding
            for (int s = 0; s < (n - i) * cell; s++) System.out.print(" ");
            // Print numbers from n down to n - i + 1
            for (int j = n; j >= n - i + 1; j--) {
                System.out.printf("%" + cell + "d", j); // fixed-width cell
            }
            System.out.println();
        }
    }
}

/*
Sample Input/Output:
Enter number of rows: 5
                5
            5   4
        5   4   3
    5   4   3   2
5   4   3   2   1
*/
