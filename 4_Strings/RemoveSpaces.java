import java.util.*;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove all spaces using replaceAll
        String noSpaces = str.replaceAll("\\s", "");

        System.out.println("String without spaces: " + noSpaces);
    }
}

/*
Sample Input/Output:
Enter a string:  Hello  World  123
String without spaces: HelloWorld123
*/
