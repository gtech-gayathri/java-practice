import java.util.Scanner;
public class StrCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String copy = "";  // Empty string to store copied characters
        
        for (int i = 0; i < str.length(); i++) {
            copy += str.charAt(i); // Append each character
        }
        
        System.out.println("Original String: " + str);
        System.out.println("Copied String: " + copy);
    }
}
