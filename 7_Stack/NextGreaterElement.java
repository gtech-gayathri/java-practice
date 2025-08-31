import java.util.*;

public class NextGreaterElement {

    // Function to find NGE for each element
    public static int[] findNGE(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Remove smaller elements from stack
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty → no greater element
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

        // Find NGE
        int[] nge = findNGE(arr);

        // Print result
        System.out.println("Next Greater Elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " → " + nge[i]);
        }

        sc.close();
    }
}

/*
---------------- SAMPLE INPUT/OUTPUT ----------------

Input:
Enter number of elements: 4
Enter the elements:
4 5 2 25

Output:
Next Greater Elements:
4 → 5
5 → 25
2 → 25
25 → -1

----------------------------------------------------

Input:
Enter number of elements: 4
Enter the elements:
13 7 6 12

Output:
Next Greater Elements:
13 → -1
7 → 12
6 → 12
12 → -1
----------------------------------------------------
*/
