import java.util.*;

public class LcmHcfCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter two numbers to calculate LCM and HCF:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int a = num1;
        int b = num2;

        // Calculate HCF using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int hcf = a;

        // Calculate LCM using formula: LCM * HCF = num1 * num2
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}

/*
Sample Input:
12 18

Sample Output:
HCF of 12 and 18 is: 6
LCM of 12 and 18 is: 36
*/
