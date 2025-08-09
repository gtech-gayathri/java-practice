import java.util.*;
public class AverageOfTwoNumbers {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Input: two numbers
        int a = s.nextInt();
        int b = s.nextInt();

        // Calculate average
        double average = (a + b) / 2.0;

        System.out.println("Average of two numbers is: " + average);
    }
}

/*
Sample Input:
13 12

Sample Output:
Average of two numbers is: 12.5
*/
