import java.util.*;
public class QuickSort {
    
    // Partition function takes last element as pivot,
    // places pivot at correct position in sorted array,
    // and places smaller elements to left and greater to right
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = low - 1;       // Index of smaller element
        
        for(int j = low; j < high; j++) {
            // If current element is smaller or equal to pivot
            if(arr[j] <= pivot) {
                i++;
                
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap pivot element to correct position
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1; // Return pivot index
    }
    
    // The main QuickSort function that recursively sorts subarrays
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);
            
            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
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
        
        // Call quickSort on entire array
        quickSort(arr, 0, n - 1);
        
        // Display sorted array
        System.out.println("Sorted array (Quick Sort): " + Arrays.toString(arr));
    }
}

/*
Sample Input:
7
10 7 8 9 1 5 6

Sample Output:
Sorted array (Quick Sort): [1, 5, 6, 7, 8, 9, 10]
*/
