import java.util.*;

public class MiddleDigitCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a three-digit number:");
        int num = s.nextInt();

        int firstDigit = num / 100;
        int secondDigit = (num / 10) % 10;
        int thirdDigit = num % 10;

        if (secondDigit == (firstDigit + thirdDigit))
            System.out.println("Middle digit is equal to the sum of other two digits");
        else
            System.out.println("Middle digit is not equal to the sum of other two digits");
    }
}

/*
Sample Input:
352

Sample Output:
Middle digit is equal to the sum of other two digits
*/
