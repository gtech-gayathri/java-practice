A company insures its drivers in the following cases
If the driver is married
If the driver is unmarried, male and above 30yrs of age
If the driver is unmarried, female and above 25yrs of age
   i.	Write a program to determine whether the driver is insured or not.(nested-if)


import java.util.*;

class DriverInsurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marital status (married/unmarried): ");
        String maritalStatus = sc.next().toLowerCase();

        System.out.print("Enter gender (male/female): ");
        String gender = sc.next().toLowerCase();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        boolean insured = false;

        if (maritalStatus.equals("married")) {
            insured = true;
        } else { // unmarried
            if (gender.equals("male")) {
                if (age > 30) {
                    insured = true;
                }
            } else if (gender.equals("female")) {
                if (age > 25) {
                    insured = true;
                }
            }
        }

        if (insured) {
            System.out.println("Driver is insured.");
        } else {
            System.out.println("Driver is not insured.");
        }
    }
}

/*
Sample Input:
Enter marital status (married/unmarried): unmarried
Enter gender (male/female): male
Enter age: 35

Sample Output:
Driver is insured.
*/
