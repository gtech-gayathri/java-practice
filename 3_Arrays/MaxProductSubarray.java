//Find the contiguous sequence of numbers in the array that, when multiplied together, produce the highest product.

import java.util.*;
public class MaxProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxProduct = maxProductSubarray(arr);
        System.out.println("Maximum product subarray is: " + maxProduct);
    }

    // Function to find maximum product subarray
    static int maxProductSubarray(int[] arr) {
        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];

            // When multiplied by negative number,
            // max becomes min and min becomes max
            if (current < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // maxSoFar is max of current element and maxSoFar * current
            maxSoFar = Math.max(current, maxSoFar * current);
            // minSoFar is min of current element and minSoFar * current
            minSoFar = Math.min(current, minSoFar * current);

            // Update result if maxSoFar is greater
            result = Math.max(result, maxSoFar);
        }
        return result;
    }
}

/*
Sample Input:
Enter number of elements: 5
Enter the elements:
6 -3 -10 0 2

Sample Output:
Maximum product subarray is: 180
*/
