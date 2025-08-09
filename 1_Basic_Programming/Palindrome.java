import java.util.*;
public class PalindromeNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome:");
        int n = s.nextInt();
        int original = n;
        int reverse = 0;

        // Reverse the number
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

       
        if (original == reverse)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");
    }
}

/*
Sample Input:
121

Sample Output:
121 is a palindrome.
*/
