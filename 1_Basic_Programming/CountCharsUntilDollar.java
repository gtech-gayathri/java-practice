import java.util.*;

public class CountCharsUntilDollar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        char ch;

        System.out.println("Enter characters continuously (enter '$' to stop):");

        while (true) {
            ch = s.next().charAt(0);
            if (ch == '$')
                break;
            count++;
        }

        System.out.println("Number of characters entered before '$': " + count);
    }
}

/*
Sample Input:
a b c d e $

Sample Output:
Number of characters entered before '$': 5
*/
