// Sliding Window Maximum using Deque in Java

import java.util.*;

class SlidingWindowMaxDeque {
    static void maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < arr.length; i++) {
            // Remove indices out of current window
            while (!dq.isEmpty() && dq.peek() <= i - k) dq.poll();

            // Remove indices whose values are smaller than current element
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) dq.pollLast();

            dq.offer(i);

            // Print max of current window
            if (i >= k - 1) System.out.print(arr[dq.peek()] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        System.out.println("Sliding Window Maximum:");
        maxSlidingWindow(arr, k);
    }
}

/*
Sample Input/Output:

Enter size of array: 8
Enter array elements: 1 3 -1 -3 5 3 6 7
Enter window size k: 3
Sliding Window Maximum:
3 3 5 5 6 7
*/
