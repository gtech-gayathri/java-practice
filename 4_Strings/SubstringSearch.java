import java.util.*;

public class SubstringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring to search: ");
        String subStr = sc.nextLine();

        if (mainStr.contains(subStr)) {
            System.out.println("Substring found!");
        } else {
            System.out.println("Substring not found!");
        }
    }
}

/*
Sample Input/Output:
Enter main string: Hello World
Enter substring to search: World
Substring found!

Enter main string: Hello World
Enter substring to search: Java
Substring not found!
*/
