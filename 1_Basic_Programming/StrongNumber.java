import java.util.*;

class StrongNumber {
    // Function to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number to check if it is a Strong number:");
        int num = s.nextInt();

        int temp = num;
        int sum = 0;

        // Calculate sum of factorial of digits
        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;
        }

        // Check if sum of factorial of digits equals original number
        if (sum == temp)
            System.out.println(temp + " is a Strong number.");
        else
            System.out.println(temp + " is not a Strong number.");
    }
}

/*
Sample Input:
145

Sample Output:
145 is a Strong number.

Explanation:
1! + 4! + 5! = 1 + 24 + 120 = 145
*/
