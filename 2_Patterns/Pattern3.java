import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print numbers from 1 to i-1
            for (int j = 1; j < i; j++) {
                System.out.print(j + "\t");
            }
            // Print 1 at the end of each row
            System.out.print("1");
            System.out.println();
        }
    }
}

/*
Sample Input/Output:
Enter the number of rows: 6
1
1   1
1   2   1
1   2   3   1
1   2   3   4   1
1   2   3   4   5   1
*/
