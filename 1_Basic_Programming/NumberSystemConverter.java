import java.util.*;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose conversion:");
        System.out.println("1. Decimal to Binary, Octal, Hexadecimal");
        System.out.println("2. Binary to Decimal");
        System.out.println("3. Octal to Decimal");
        System.out.println("4. Hexadecimal to Decimal");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter decimal number: ");
                int decimal = sc.nextInt();
                System.out.println("Binary: " + Integer.toBinaryString(decimal));
                System.out.println("Octal: " + Integer.toOctalString(decimal));
                System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
                break;

            case 2:
                System.out.print("Enter binary number: ");
                String binary = sc.next();
                int decFromBin = Integer.parseInt(binary, 2);
                System.out.println("Decimal: " + decFromBin);
                break;

            case 3:
                System.out.print("Enter octal number: ");
                String octal = sc.next();
                int decFromOct = Integer.parseInt(octal, 8);
                System.out.println("Decimal: " + decFromOct);
                break;

            case 4:
                System.out.print("Enter hexadecimal number: ");
                String hex = sc.next();
                int decFromHex = Integer.parseInt(hex, 16);
                System.out.println("Decimal: " + decFromHex);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

/*
Sample Input 1:
1
255

Sample Output 1:
Binary: 11111111
Octal: 377
Hexadecimal: FF

Sample Input 2:
2
1010

Sample Output 2:
Decimal: 10
*/
