import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Add character only if it's not already in result
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}

/*
Sample Input/Output:
Enter a string: programming
String after removing duplicates: progamin
*/
