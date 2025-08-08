import java.util.Scanner;

public class Circle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();

        
        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
}

/*
Sample Input:
Enter the radius of the circle: 5

Sample Output:
Area of the circle with radius 5 is: 78.53981633974483
*/
