import java.util.*;
public class CountDigits {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to count the digits:");
        int n = s.nextInt();
        int num = n;
        int count = 0;

        // Count digits (including zeros)
        while (n != 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Digits count in " + num + " are: " + count);
    }
}

/*
Sample Input:
10500

Sample Output:
Digits count in 10500 are: 5
*/
