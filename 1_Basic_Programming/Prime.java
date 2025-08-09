import java.util.*;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int n = s.nextInt();
        int flag = 0; 

        if (n <= 1) {
            flag = 1; // numbers <= 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = 1; // found a divisor
                    break;
                }
            }
        }

        if (flag == 0)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}

/*
Sample Input:
29

Sample Output:
29 is a prime number.
*/
