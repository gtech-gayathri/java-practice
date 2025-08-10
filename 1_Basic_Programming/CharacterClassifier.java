import java.util.*;
class CharacterClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("It is a Digit.");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a Lowercase character.");
        } 
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("It is an Uppercase character.");
        } 
        else {
            System.out.println("It is a Special character.");
        }
    }
}
