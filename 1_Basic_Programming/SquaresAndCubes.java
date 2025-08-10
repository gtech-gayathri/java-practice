import java.util.*;

public class SquaresAndCubes {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a positive natural number to find squares and cubes up to that number: ");
        int num = s.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            System.out.println("Squares are:");
            for (int i = 1; i <= num; i++) {
                int square = (int) Math.pow(i, 2);
                System.out.print(square + " ");
            }

            System.out.println("\nCubes are:");
            for (int i = 1; i <= num; i++) {
                int cube = (int) Math.pow(i, 3);
                System.out.print(cube + " ");
            }
            System.out.println();
        }
    }
}

/*
Sample Input:
5

Sample Output:
Squares are:
1 4 9 16 25 
Cubes are:
1 8 27 64 125 
*/
