import java.util.*;
public class SecondLargestSmallestDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // Find second smallest distinct
        int secondSmallest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                secondSmallest = arr[i];
                break;
            }
        }

        // Find second largest distinct
        int secondLargest = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondSmallest == Integer.MIN_VALUE)
            System.out.println("No distinct second smallest number found.");
        else
            System.out.println("Second smallest distinct number: " + secondSmallest);

        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("No distinct second largest number found.");
        else
            System.out.println("Second largest distinct number: " + secondLargest);
    }
}

/*
Sample Input:
8
10 5 5 8 20 20 15 3

Sample Output:
Second smallest distinct number: 5
Second largest distinct number: 15
*/
