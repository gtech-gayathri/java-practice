import java.util.*;
public class FrequencyCountOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int[] freq = new int[n];  // To store frequency of each element
        Arrays.fill(freq, -1);    // Initialize freq array with -1
        
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++) {
            if(freq[i] == -1) {  // If not counted yet
                int count = 1;
                for(int j=i+1; j<n; j++) {
                    if(arr[i] == arr[j]) {
                        count++;
                        freq[j] = 0;  // Mark as counted
                    }
                }
                freq[i] = count;  // Store frequency of element at i
            }
        }
        
        System.out.println("Frequency of elements:");
        for(int i=0; i<n; i++) {
            if(freq[i] != 0) {
                System.out.println(arr[i] + " occurs " + freq[i] + " time(s)");
            }
        }
    }
}

/*
Sample Input:
Enter number of elements: 6
Enter the elements:
4 5 4 6 5 5

Sample Output:
Frequency of elements:
4 occurs 2 time(s)
5 occurs 3 time(s)
6 occurs 1 time(s)
*/
