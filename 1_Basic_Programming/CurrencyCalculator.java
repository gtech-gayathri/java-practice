import java.util.*;

class CurrencyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int choice = 1;
        int notes;

        switch (choice) {
            case 1:
                notes = amount / 500;
                System.out.println("500 notes: " + notes);
                amount %= 500;
            case 2:
                notes = amount / 100;
                System.out.println("100 notes: " + notes);
                amount %= 100;
            case 3:
                notes = amount / 20;
                System.out.println("20 notes: " + notes);
                amount %= 20;
            case 4:
                notes = amount / 10;
                System.out.println("10 notes: " + notes);
                amount %= 10;
            case 5:
                notes = amount / 5;
                System.out.println("5 notes: " + notes);
                amount %= 5;
            case 6:
                notes = amount / 2;
                System.out.println("2 notes: " + notes);
                amount %= 2;
            case 7:
                notes = amount / 1;
                System.out.println("1 notes: " + notes);
                break;
        }

        /*
        Sample Input:
        Enter the amount: 1387

        Sample Output:
        500 notes: 2
        100 notes: 3
        20 notes: 4
        10 notes: 0
        5 notes: 1
        2 notes: 1
        1 notes: 0
        */
    }
}
