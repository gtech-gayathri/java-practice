import java.util.*;

public class NextSmallerElement {

    // Function to find NSE for each element
    public static int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Remove bigger elements from stack
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // If stack is empty → no smaller element
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push this element into stack
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dynamic input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find NSE
        int[] nse = findNSE(arr);

        // Print result
        System.out.println("Next Smaller Elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " → " + nse[i]);
        }

        sc.close();
    }
}

/*
---------------- SAMPLE INPUT/OUTPUT ----------------

Input:
Enter number of elements: 4
Enter the elements:
4 5 2 10

Output:
Next Smaller Elements:
4 → 2
5 → 2
2 → -1
10 → -1

----------------------------------------------------

Input:
Enter number of elements: 5
Enter the elements:
13 7 6 12 5

Output:
Next Smaller Elements:
13 → 7
7 → 6
6 → 5
12 → 5
5 → -1
----------------------------------------------------
*/
