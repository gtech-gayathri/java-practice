import java.util.*;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed string: " + rev);
    }
}

/*
Sample Input/Output:
Enter a string: hello
Reversed string: olleh
*/
