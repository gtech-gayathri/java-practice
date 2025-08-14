import java.util.*;

public class LeftAlignedDecreasingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print 'i' repeated (n - i + 1) times
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}

/*
Sample Output for n = 5:
1	1	1	1	1
2	2	2	2
3	3	3
4	4
5
*/
