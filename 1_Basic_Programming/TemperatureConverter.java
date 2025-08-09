import java.util.*;
public class TemperatureConverter {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            int choice = s.nextInt();

            if (choice == 1) { // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                double c = s.nextDouble();
                double f = (c * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit is: " + f);
            } 
            else if (choice == 2) { // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                double f = s.nextDouble();
                double c = (f - 32) * 5 / 9;
                System.out.println("Temperature in Celsius is: " + c);
            } 
            else if (choice == 3) { // Exit
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

/*
Sample Run:
1. Celsius to Fahrenheit
2. Fahrenheit to Celsius
3. Exit
Enter your choice (1-3): 1
Enter temperature in Celsius: 37
Temperature in Fahrenheit is: 98.6
Enter your choice (1-3): 3
Exiting...
*/
