import java.util.*;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the upper limit of the range: ");
        int num = s.nextInt();

        System.out.println("Prime numbers between 2 and " + num + ":");
        for (int i = 2; i <= num; i++) {
            int flag = 1; // Assume i is prime
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 0; // i is not prime
                    break;
                }
            }
            if (flag == 1)
                System.out.print(i + " ");
        }
        System.out.println(); // Move to next line after printing all primes
    }
}

/*
Sample Input:
20

Sample Output:
Prime numbers between 2 and 20:
2 3 5 7 11 13 17 19 
*/
