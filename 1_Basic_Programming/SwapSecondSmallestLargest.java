import java.util.*;

public class SwapSecondSmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Create a copy and sort it to find 2nd smallest and 2nd largest
        int[] temp = arr.clone();
        Arrays.sort(temp);

        int secondSmallest = temp[1];
        int secondLargest = temp[n - 2];

        // Find positions of 2nd smallest and 2nd largest in original array
        int posSmall = -1, posLarge = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == secondSmallest && posSmall == -1)
                posSmall = i;
            if (arr[i] == secondLargest && posLarge == -1)
                posLarge = i;
        }

        // Swap the elements
        int tempSwap = arr[posSmall];
        arr[posSmall] = arr[posLarge];
        arr[posLarge] = tempSwap;

        // Display the updated array
        System.out.println("Array after swapping 2nd smallest and 2nd largest:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}

/*
Sample Input:
6
5 1 3 7 9 2

Sample Output:
Array after swapping 2nd smallest and 2nd largest:
5 7 3 1 9 2
*/
