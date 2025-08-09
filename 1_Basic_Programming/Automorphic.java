import java.util.*;
public class Automorphic {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is automorphic or not:");
        int num = s.nextInt();
        int square = num * num;
        boolean isAutomorphic = true;

        // Check last digits of square and number
        int temp = num; // keep original number for checking
        while (temp != 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break; 
            }
            square /= 10;
            temp /= 10;
        }

        if (isAutomorphic)
            System.out.println("Given number is automorphic.");
        else
            System.out.println("Given number is not automorphic.");
    }
}

/*
Sample Input:
25

Sample Output:
Given number is automorphic.
(Explanation: 25² = 625 → ends with 25)
*/
