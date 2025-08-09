import java.util.*;
public class SumOfDistinctDigits {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to calculate the sum of distinct digits:");
        int n = s.nextInt();
        int sum = 0;

        boolean seen[] = new boolean[10]; // tracks which digits have been counted

        // Logic to sum distinct digits
        while (n != 0) {
            int digit = n % 10;
            if (!seen[digit]) {
                sum += digit;
                seen[digit] = true;
            }
            n /= 10;
        }

        System.out.println("Sum is: " + sum);
    }
}

/*
Sample Input:
112233

Sample Output:
Sum is: 6
*/
