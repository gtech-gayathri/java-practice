import java.util.*;

class MinSubtractArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Find minimum element
        int min = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Subtract min from each element
        for (int i = 0; i < 10; i++) {
            arr[i] = arr[i] - min;
        }

        System.out.println("Array after subtracting minimum element (" + min + "):");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Sample Input:
Enter 10 elements:
5 8 3 9 2 4 7 6 11 10

Sample Output:
Array after subtracting minimum element (2):
3 6 1 7 0 2 5 4 9 8
*/
