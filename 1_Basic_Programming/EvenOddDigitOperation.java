import java.util.*;
class EvenOddDigitCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (max 6 digits): ");
        int num = sc.nextInt();

        int sumEven = 0;
        int mulOdd = 1;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                mulOdd *= digit;
            }
            num /= 10;
        }

        System.out.println("Sum of even digits: " + sumEven);
    }
}

/*
Sample Input:
Enter a number (max 6 digits): 123456

Sample Output:
Sum of even digits: 12
Multiplication of odd digits: 15
*/
