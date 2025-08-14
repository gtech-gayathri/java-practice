import java.util.*;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring to replace: ");
        String oldSub = sc.nextLine();

        System.out.print("Enter new substring: ");
        String newSub = sc.nextLine();

        String result = mainStr.replace(oldSub, newSub);

        System.out.println("Updated string: " + result);
    }
}

/*
Sample Input/Output:
Enter main string: I love Java
Enter substring to replace: Java
Enter new substring: Python
Updated string: I love Python
*/
