import java.util.*;

public class DecreasingSequenceFromN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            // Print numbers from n down to (n - i + 1)
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}

/*
Sample Output for n = 5:
5	4	3	2	1
5	4	3	2
5	4	3
5	4
5
*/
