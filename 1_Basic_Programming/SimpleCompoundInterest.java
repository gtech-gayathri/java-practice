import java.util.*;

public class SimpleCompoundInterest {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Input: principal, time, rate
        double p = s.nextDouble();
        double t = s.nextDouble();
        double r = s.nextDouble();

        // Calculate simple interest
        double si = (p * t * r) / 100;

        // Calculate compound interest
        double ci = p * Math.pow((1 + r / 100), t) - p;

        System.out.println("Simple Interest is: " + si);
        System.out.println("Compound Interest is: " + ci);
    }
}

/*
Sample Input:
1000 2 5

Sample Output:
Simple Interest is: 100.0
Compound Interest is: 102.5
*/
