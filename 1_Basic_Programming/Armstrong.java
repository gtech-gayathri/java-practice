import java.util.*;
public class Armstrong {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check if it is an Armstrong number:");
        int num = s.nextInt();
        int temp = num;

        // Count digits
        int count = 0, n = num;
        while (n != 0) {
            count++;
            n /= 10;
        }

        // Calculate Armstrong sum
        int sum = 0;
        n = num;
        while (n != 0) {
            int rem = n % 10;
            sum += Math.pow(rem, count);
            n /= 10;
        }

        // Check Armstrong condition
        if (temp == sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}

/*
Sample Input 1:
1634
Sample Output 1:
Armstrong number
(Explanation: 1⁴ + 6⁴ + 3⁴ + 4⁴ = 1634)

Sample Input 2:
123
Sample Output 2:
Not an Armstrong number
(Explanation: 1³ + 2³ + 3³ = 36, not 123)
*/
