import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting array before binary search
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Reading element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Binary search
        int low = 0, high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at position (sorted array index): " + (mid + 1));
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}

/*
---------------- SAMPLE INPUT/OUTPUT ----------------
Enter the number of elements:
5
Enter the elements:
40
10
30
50
20
Sorted Array: [10, 20, 30, 40, 50]
Enter element to search: 30
Element found at position (sorted array index): 3

------------------------------------------------------

Enter the number of elements:
4
Enter the elements:
8
2
5
1
Sorted Array: [1, 2, 5, 8]
Enter element to search: 7
Element not found.

------------------------------------------------------
*/
