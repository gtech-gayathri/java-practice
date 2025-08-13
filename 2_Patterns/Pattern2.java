import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print 'i' exactly 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "\t"); // \t for tab spacing
            }
            System.out.println();
        }
    }
}

/*
Sample Input/Output:
Enter the number of rows: 5
1
2   2
3   3   3
4   4   4   4
5   5   5   5   5
*/
