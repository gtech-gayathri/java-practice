import java.util.*;

public class LeftAlignedDecreasingFromN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            // Print 'i' repeated i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}

/*
Sample Output for n = 5:
5	5	5	5	5
4	4	4	4
3	3	3
2	2
1
*/
