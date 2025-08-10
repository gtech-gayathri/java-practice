import java.util.*;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a year to check if it is a leap year: ");
        int year = s.nextInt();

        // Leap year conditions:
        // Divisible by 4 but not by 100, OR divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap year.");
        } else {
            System.out.println(year + " is not a Leap year.");
        }
    }
}

/*
Sample Input:
2024

Sample Output:
2024 is a Leap year.
*/
