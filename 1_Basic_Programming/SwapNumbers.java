import java.util.*;

public class SwapNumbers {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Swap using third variable
        System.out.println("Enter two numbers to swap using third variable:");
        int a = s.nextInt();
        int b = s.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping with third variable: a = " + a + ", b = " + b);
        
        // Swap without using third variable
        System.out.println("Enter two numbers to swap without using third variable:");
        int x = s.nextInt();
        int y = s.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping without third variable: x = " + x + ", y = " + y);
    }
}

/*
Sample Input:
Enter two numbers to swap using third variable:
5 10
Enter two numbers to swap without using third variable:
7 15

Sample Output:
After swapping with third variable: a = 10, b = 5
After swapping without third variable: x = 15, y = 7
*/


/*
Sample Input:
5 10

Sample Output:
After swapping with third variable: a = 10, b = 5
After swapping without third variable: a = 5, b = 10
*/
