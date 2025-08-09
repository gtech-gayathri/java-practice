import java.util.*;
public class SumOfDigits {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits:");
        int n = s.nextInt();
        int num = n,sum=0;

        // Logic to sum digits
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}

/*
Sample Input:
1053

Sample Output:
Sum of digits of 1053 is: 9
*/
