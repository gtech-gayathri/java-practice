import java.util.*;

public class OddOrEven {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        // Check odd or even
        if (a % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}

/*
Sample Input:
8

Sample Output:
Even number
*/
