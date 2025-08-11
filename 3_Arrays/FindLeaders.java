// A leader in an array is an element that is greater than all the elements to its right.

import java.util.*;
public class FindLeaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Leaders in the array are:");

        int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight + " "); // Last element is always a leader

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}

/*
Sample Input:
Enter number of elements: 6
Enter the elements:
16 17 4 3 5 2

Sample Output:
Leaders in the array are:
2 5 17 
*/
