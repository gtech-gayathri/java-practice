import java.util.*;

public class PrintInRows {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the range of numbers to print (5 numbers per row): ");
        int num = s.nextInt();

        int count = 0; // Count how many numbers printed in current row
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "\t"); // Tab space for better alignment
            count++;

            if (count == 5) {
                System.out.println(); // Move to next line after 5 numbers
                count = 0;
            }
        }

        // If last line had fewer than 5 numbers, print a newline
        if (count != 0) {
            System.out.println();
        }
    }
}

/*
Sample Input:
13

Sample Output:
1    2    3    4    5    
6    7    8    9    10   
11   12   13
*/
