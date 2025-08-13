import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            // Print spaces for formatting
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            int num = 1; // first value in a row is always 1

            // Inner loop for values
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                // Calculate next value using binomial coefficient
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

/*
Sample Input:
Enter number of rows: 5

Sample Output:
      1 
     1 1 
    1 2 1 
   1 3 3 1 
  1 4 6 4 1
*/
