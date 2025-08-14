import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String longest = "";
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            String current = "";
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                // If character already exists in current substring, break
                if (current.indexOf(ch) != -1) {
                    break;
                }
                current += ch;
                // Update longest substring if needed
                if (current.length() > maxLength) {
                    maxLength = current.length();
                    longest = current;
                }
            }
        }

        System.out.println("Longest substring without repeating characters: " + longest);
        System.out.println("Length: " + maxLength);
    }
}

/*
Example Run 1:
Enter a string: abcabcbb
Longest substring without repeating characters: abc
Length: 3

Example Run 2:
Enter a string: pwwkew
Longest substring without repeating characters: wke
Length: 3
*/
