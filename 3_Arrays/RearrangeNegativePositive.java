/*Rearrange an array so that all negative numbers come first, followed by all positive numbers and zeros, 
while maintaining the original relative order within the negative and positive groups.*/



import java.util.*;

public class RearrangeNegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] rearranged = new int[n];
        int index = 0;
        
        // Add negative numbers first
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                rearranged[index++] = arr[i];
            }
        }
        
        // Add positive numbers and zeroes
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                rearranged[index++] = arr[i];
            }
        }
        
        System.out.println("Array after rearranging (negatives first, then positives):");
        for(int i = 0; i < n; i++){
            System.out.print(rearranged[i] + " ");
        }
    }
}

/*
Sample Input:
7
3 -2 0 5 -7 4 -1

Sample Output:
Array after rearranging (negatives first, then positives):
-2 -7 -1 3 0 5 4
*/



