import java.util.*;
public class MergeSort {
    
    // Function to merge two subarrays of arr[]
    // First subarray is arr[left..mid]
    // Second subarray is arr[mid+1..right]
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; // Length of first subarray
        int n2 = right - mid;    // Length of second subarray
        
        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        
        // Merge the temporary arrays back into arr[left..right]
        int i = 0, j = 0, k = left;
        
        // Pick smaller element from L[] or R[] and place it in arr[]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of L[], if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of R[], if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    // Main function that sorts arr[left..right] using merge()
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find middle point
            int mid = left + (right - left) / 2;
            
            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            
            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Call mergeSort on the entire array
        mergeSort(arr, 0, n - 1);
        
        // Display the sorted array
        System.out.println("Sorted array (Merge Sort): " + Arrays.toString(arr));
    }
}

/*
Sample Input:
6
38 27 43 3 9 82

Sample Output:
Sorted array (Merge Sort): [3, 9, 27, 38, 43, 82]
*/
