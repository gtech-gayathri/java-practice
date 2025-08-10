import java.util.*;

public class PositionalValueFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the digit to find positional values: ");
        int digit = sc.nextInt();

        int temp = num;
        int position = 0;      // Digit position (0-based from right)
        boolean found = false;

        System.out.println("Positional values of digit " + digit + " in number " + num + ":");

        while (temp > 0) {
            int currentDigit = temp % 10;
            if (currentDigit == digit) {
                found = true;
                int posValue = digit * (int) Math.pow(10, position);
                System.out.println(posValue);
            }
            temp /= 10;
            position++;
        }

        if (!found) {
            System.out.println("Digit " + digit + " not found in number " + num);
        }
    }
}

/*
Sample Input:
Enter the number: 25452
Enter the digit to find positional values: 5

Sample Output:
Positional values of digit 5 in number 25452:
50
5000
*/
