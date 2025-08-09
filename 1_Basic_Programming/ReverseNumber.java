import java.util.*;
public class ReverseNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int n = s.nextInt();
        int num = n;
        int rev = 0;

        // Logic to reverse the number
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        System.out.println("Reverse of " + num + " is: " + rev);
    }
}

/*
Sample Input:
12345

Sample Output:
Reverse of 12345 is: 54321
*/
