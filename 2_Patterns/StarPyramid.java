public class StarPyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Output:
    *
   ***
  *****
 *******
*********
*/
