import java.util.*;

public class Factorial {
    // Recursive factorial method
    public static long factorialRecursive(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorialRecursive(n - 1);
    }

    // Non-recursive factorial method
    public static long factorialIterative(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to calculate factorial: ");
        int num = s.nextInt();

        long non_recursive = factorialIterative(num);
        long recursive = factorialRecursive(num);

        System.out.println("Factorial of " + num + " (iterative) is: " + non_recursive);
        System.out.println("Factorial of " + num + " (recursive) is: " + recursive);
    }
}

/*
Sample Input:
6

Sample Output:
Factorial of 6 (iterative) is: 720
Factorial of 6 (recursive) is: 720
*/
