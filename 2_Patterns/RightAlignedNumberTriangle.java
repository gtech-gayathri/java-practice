import java.util.*;
public class RightAlignedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces for right alignment
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  "); // Two spaces
            }

            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
Sample Input/Output:
Enter number of rows: 5
        1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5 
*/
