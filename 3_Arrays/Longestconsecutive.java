/*Problem Explanation:
Given an unsorted array of integers, find the length of the longest sequence of consecutive numbers. 
The numbers do not need to be adjacent in the array but must be consecutive integers.
*/

import java.util.*;
public class Longestconsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find longest consecutive sequence length
        int longest = findLongestConsecutive(arr);
        System.out.println("Length of the longest consecutive sequence: " + longest);
    }

    public static int findLongestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        // Sort the array first (simple way)
        java.util.Arrays.sort(arr);

        int longest = 1;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            // If current number is same as previous, skip it
            if (arr[i] == arr[i - 1]) continue;

            // If current number is exactly 1 more than previous, increase count
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                // Reset count if not consecutive
                count = 1;
            }

            // Update longest sequence length
            if (count > longest) {
                longest = count;
            }
        }

        return longest;
    }
}

/*
Sample Input:
6
100 4 200 1 3 2

Sample Output:
Length of the longest consecutive sequence: 4
*/





/* Example:
Input: [100, 4, 200, 1, 3, 2]

Longest consecutive sequence is: 1, 2, 3, 4

Output: 4 */
