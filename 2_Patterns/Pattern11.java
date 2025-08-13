import java.util.*;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading tabs for right alignment
            for (int s = 0; s < i; s++) {
                System.out.print("\t");
            }
            // Print decreasing sequence
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}

/*
Sample Input/Output:
Enter the number of rows: 5
1	2	3	4	5
	1	2	3	4
		1	2	3
			1	2
				1
*/
