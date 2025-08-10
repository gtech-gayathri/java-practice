import java.util.*;

public class InsertDeleteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read initial array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

      
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Insert a new element
        System.out.print("Enter position to insert element: ");
        int pos = sc.nextInt();

        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();

        // Shift elements right from 'pos' to 'n-1' to create space for new element
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = val; // Insert the new element at position 'pos'
        n++; // Increase the size of the array

        // Print array after insertion
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
        //Delete an element
        System.out.print("Enter position to delete element: ");
        int delPos = sc.nextInt();

        // Shift elements left starting from 'delPos+1' to overwrite the element to delete
        for (int i = delPos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--; // Decrease the size of the array

        //Print array after deletion
        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Sample Input:
Enter number of elements: 5
Enter 5 elements:
10 20 30 40 50
Enter position to insert element: 2
Enter value to insert: 99
Enter position to delete element: 3

Sample Output:
Array after insertion:
10 20 99 30 40 50
Array after deletion:
10 20 99 40 50
*/
