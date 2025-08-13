import java.util.*;

public class IncreasingNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t"); // \t for tab spacing
            }
            System.out.println();
        }
    }
}

/*
Sample Input/Output:
Enter the number of rows: 5
1
1   2
1   2   3
1   2   3   4
1   2   3   4   5
*/
