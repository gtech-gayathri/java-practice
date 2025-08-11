import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Duplicate elements are: ");
        boolean foundDuplicate = false;

        for (int i = 0; i < n; i++) {
            // Check if this element has appeared before
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) continue;

            // Check if duplicate exists
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    foundDuplicate = true;
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.print("No duplicates found");
        }
    }
}

/*
Sample Input:
6
5 3 7 3 9 5

Sample Output:
Duplicate elements are: 3 5
*/
