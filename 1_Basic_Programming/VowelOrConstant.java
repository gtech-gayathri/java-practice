import java.util.*;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }
    }
}

/*
Sample Input:
E

Sample Output:
e is a vowel.
*/
