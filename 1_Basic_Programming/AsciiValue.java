import java.util.*;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Read first character of input
        int ascii = (int) ch;            // Convert char to ASCII value

        System.out.println("ASCII value of '" + ch + "' is: " + ascii);
    }
}

/*
Sample Input:
A

Sample Output:
ASCII value of 'A' is: 65
*/
