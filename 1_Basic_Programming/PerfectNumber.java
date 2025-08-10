import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number to check if it is perfect:");
        int num = s.nextInt();
        
        int sum = 0;
        
        // Sum all divisors of num except num itself
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        // Check if sum of divisors equals the number
        if (sum == num) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }
    }
}

/*
Sample Input:
28

Sample Output:
28 is a Perfect number.

Explanation:
Divisors of 28 (excluding 28) are 1, 2, 4, 7, 14
Sum = 1+2+4+7+14 = 28
*/
