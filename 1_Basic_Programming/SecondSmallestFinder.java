import java.util.*;

public class SecondSmallestFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int position = -1;

        // Find smallest and second smallest distinct values
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        // Find position (1-based) of second smallest number
        for (int i = 0; i < n; i++) {
            if (arr[i] == secondSmallest) {
                position = i + 1;
                break;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no distinct second smallest number.");
        } else {
            System.out.println("Second smallest number is: " + secondSmallest);
            System.out.println("Its position is: " + position);
        }
    }
}

/*
Sample Input:
5
7 2 8 2 10

Sample Output:
Second smallest number is: 7
Its position is: 1
*/
