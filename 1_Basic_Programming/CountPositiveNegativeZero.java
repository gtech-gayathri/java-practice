import java.util.*;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num > 0)
                positiveCount++;
            else if (num < 0)
                negativeCount++;
            else
                zeroCount++;
        }

        System.out.println("\nTotal Positive Numbers: " + positiveCount);
        System.out.println("Total Negative Numbers: " + negativeCount);
        System.out.println("Total Zeros: " + zeroCount);
    }
}

/*
Sample Input:
8
3 -2 0 7 0 -5 6 0

Sample Output:
Total Positive Numbers: 3
Total Negative Numbers: 2
Total Zeros: 3
*/
