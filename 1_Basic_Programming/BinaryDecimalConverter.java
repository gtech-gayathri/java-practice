import java.util.*;
public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();

        if (choice == 1) {
            System.out.print("Enter a binary number: ");
            String binary = s.next();
            // Convert binary string to decimal integer
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal equivalent is: " + decimal);
        } 
        else if (choice == 2) {
            System.out.print("Enter a decimal number: ");
            int decimal = s.nextInt();
            // Convert decimal integer to binary string
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary equivalent is: " + binary);
        } 
        else {
            System.out.println("Invalid choice!");
        }
    }
}

/*
Sample Input 1:
1
1010

Sample Output 1:
Decimal equivalent is: 10

Sample Input 2:
2
10

Sample Output 2:
Binary equivalent is: 1010
*/
