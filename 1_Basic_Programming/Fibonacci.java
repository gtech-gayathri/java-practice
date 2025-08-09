import java.util.*;

public class Fibonacci {

    // Recursive method to calculate nth Fibonacci number
    public static int fiboRecursive(int n) {
        if (n <= 1)
            return n;
        else
            return fiboRecursive(n - 1) + fiboRecursive(n - 2);
    }

    // Iterative method to calculate nth Fibonacci number
    public static int fiboIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n to find the nth Fibonacci number:");
        int n = s.nextInt();

        int recursive = fiboRecursive(n);
        int non_recursive = fiboIterative(n);

        System.out.println("Using Recursion: Fibonacci number of " + n + "th term is: " + recursive);
        System.out.println("Without Recursion: Fibonacci number of " + n + "th term is: " + non_recursive);
    }
}

/*
Sample Input:
6

Sample Output:
Using Recursion: Fibonacci number of 6th term is: 8
Without Recursion: Fibonacci number of 6th term is: 8
*/
