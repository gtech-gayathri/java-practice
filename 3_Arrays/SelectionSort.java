import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort Logic
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array (Selection Sort): " + Arrays.toString(arr));
    }
}

/*
Sample Input:
Enter number of elements: 6
Enter 6 elements:
29 10 14 37 13 5

Sample Output:
Sorted array (Selection Sort): [5, 10, 13, 14, 29, 37]
*/
