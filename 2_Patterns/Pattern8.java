import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {         // Rows
            for (int j = n; j >= n - i + 1; j--) { // Numbers decreasing in each row
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}

/*
Sample Input/Output:
Enter the number of rows: 5
5
5   4
5   4   3
5   4   3   2
5   4   3   2   1
*/
