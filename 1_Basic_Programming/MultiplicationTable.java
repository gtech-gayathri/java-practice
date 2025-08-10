import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to display its multiplication table: ");
        int num = s.nextInt();

        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}

/*
Sample Input:
5

Sample Output:
Multiplication table of 5:
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
...
5 * 10 = 50
*/
