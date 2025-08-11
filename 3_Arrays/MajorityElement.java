import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find a candidate for majority element
        int candidate = findCandidate(arr, n);

        // Verify if candidate is actually majority
        if(isMajority(arr, n, candidate)) {
            System.out.println("Majority element is: " + candidate);
        } else {
            System.out.println("No majority element found");
        }
    }

    // Function to find candidate using Boyer-Moore Voting Algorithm
    static int findCandidate(int[] arr, int n) {
        int count = 1;              // Initialize count for the first element
        int candidate = arr[0];     // Set first element as candidate

        for(int i = 1; i < n; i++) {
            if(arr[i] == candidate) {
                count++;            // Same element, increment count
            } else {
                count--;            // Different element, decrement count
                if(count == 0) {   // Count reached zero, pick new candidate
                    candidate = arr[i];
                    count = 1;
                }
            }
        }
        return candidate;           // Return the potential majority element
    }

    // Function to verify if candidate is majority (> n/2 occurrences)
    static boolean isMajority(int[] arr, int n, int candidate) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == candidate)
                count++;
        }
        return count > n / 2;       // True if candidate occurs more than n/2 times
    }
}

/*
Sample Input:
Enter number of elements: 7
Enter the elements:
2 2 1 1 2 2 2

Sample Output:
Majority element is: 2
*/
