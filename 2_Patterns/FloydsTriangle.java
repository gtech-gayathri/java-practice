import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of rows from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int num = 1; // starting number

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // move to next line
        }
    }
}

/*
Sample Input:
Enter number of rows: 4

Sample Output:
1 
2 3 
4 5 6 
7 8 9 10 
*/
