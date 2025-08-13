import java.util.*;
public class RightAlignedDecreasingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces for right alignment
            for (int s = 0; s < i; s++) {
                System.out.print("  "); // Two spaces
            }

            // Print decreasing numbers starting from n
            for (int j = n; j > i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

/*
Sample Input/Output:
Enter number of rows: 5
5 4 3 2 1 
  5 4 3 2 
    5 4 3 
      5 4 
        5 
*/
