/*46.	Rajesh’s basic salary is input through the keyboard. His D.A is 40% of basic salary, and H.R.A is 20% of basic salary. 
Write a program to calculate his gross salary.*/

import java.util.*;
class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rajesh's basic salary: ");
        double basicSalary = sc.nextDouble();

        double da = 0.40 * basicSalary; // Dearness Allowance = 40% of basic
        double hra = 0.20 * basicSalary; // House Rent Allowance = 20% of basic

        double grossSalary = basicSalary + da + hra;

        System.out.println("Gross Salary: " + grossSalary);
    }
}

/*
Sample Input and Output:

Example 1:
Enter Rajesh's basic salary: 15000
Gross Salary: 21000.0

Example 2:
Enter Rajesh's basic salary: 25000
Gross Salary: 35000.0
*/
