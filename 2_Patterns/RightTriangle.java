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

//We can also write the code as follows to get right triangle

public class RightTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j <= rows - i) {
                    System.out.print("  "); // spaces
                } else {
                    System.out.print("* "); // stars
                }
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
