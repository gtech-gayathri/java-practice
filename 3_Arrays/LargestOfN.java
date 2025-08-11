import java.util.*;
public class LargestOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];  // Initialize largest with first element

        // Traverse array to find largest number
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}

/*
Sample Input:
5
12 45 7 89 23

Sample Output:
Largest number is: 89
*/
