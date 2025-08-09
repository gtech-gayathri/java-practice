import java.util.*;
public class SecondsToHMS {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Input: total seconds
        int seconds = s.nextInt();

        // Convert seconds to hours, minutes, and seconds
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int tempSeconds = seconds % 60;
        System.out.println("Hours: " + hours + " Minutes: " + minutes + " Seconds: " + tempSeconds);
    }
}

/*
Sample Input:
3665

Sample Output:
Hours: 1 Minutes: 1 Seconds: 5
*/
