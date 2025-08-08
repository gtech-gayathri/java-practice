import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {
    public static void main(String[] args) {
        System.out.print("Enter your Date of Birth (YYYY-MM-DD): ");
        LocalDate dob = LocalDate.parse(new Scanner(System.in).nextLine());

        // Logic: Calculate age in days
        long daysBetween = ChronoUnit.DAYS.between(dob, LocalDate.now());

        // Logic: Convert days to years
        long years = daysBetween / 365;

        System.out.println("Age in days: " + daysBetween);
        System.out.println("Approximate age in years: " + years);

    }
}

/*
Sample Input:
Enter your Date of Birth (YYYY-MM-DD): 2000-01-01

Sample Output:
Age in days: 9393
Approximate age in years: 25
*/
