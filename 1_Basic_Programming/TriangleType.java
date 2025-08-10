import java.util.*;
class TriangleType {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
      
        // Enter three sides of triangle
        System.out.print("Enter side a: ");
        int a = sc.nextInt();
        System.out.print("Enter side b: ");
        int b = sc.nextInt();
        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        // Check Right Angled Triangle
        if ((a * a) + (b * b) == (c * c) || 
            (b * b) + (c * c) == (a * a) || 
            (a * a) + (c * c) == (b * b)) {
            System.out.println("Right angled triangle");
        }
        // Check Equilateral Triangle
        else if ((a == b) && (b == c)) {
            System.out.println("Equilateral triangle");
        }
        // Check Isosceles Triangle
        else if ((a == b) || (b == c) || (a == c)) {
            System.out.println("Isosceles triangle");
        }
        // If none of the above, it's Scalene
        else {
            System.out.println("Scalene triangle");
        }
    }
}

/*
Sample Input and Output:

Example 1:
Enter side a: 3
Enter side b: 4
Enter side c: 5
Right angled triangle

Example 2:
Enter side a: 6
Enter side b: 6
Enter side c: 6
Equilateral triangle

Example 3:
Enter side a: 5
Enter side b: 5
Enter side c: 8
Isosceles triangle

Example 4:
Enter side a: 4
Enter side b: 5
Enter side c: 6
Scalene triangle
*/
