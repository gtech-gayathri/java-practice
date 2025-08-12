public class RightTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print("  ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
Output:
        * 
      * * 
    * * * 
  * * * * 
* * * * *
*/
