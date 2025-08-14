import java.util.*;

public class CaseToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch); // Keep non-letters unchanged
            }
        }

        System.out.println("Converted string: " + result);
    }
}

/*
Sample Input/Output:
Enter a string: HeLLo WoRLd 123
Converted string: hEllO wOrlD 123
*/
