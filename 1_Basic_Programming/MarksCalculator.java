import java.util.*;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 3 subjects:");

        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Total marks: " + total);
        System.out.printf("Average marks: %.2f\n", average);
    }
}

/*
Sample Input:
75 80 90

Sample Output:
Total marks: 245
Average marks: 81.67
*/
