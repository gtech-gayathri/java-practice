import java.util.*;

public class NumberToWords {

    // Arrays to store words for digits, tens, and teens
    static String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    static String[] teens = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", 
                              "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

    public static String twoDigitToWords(int n) {
        if (n == 0)
            return "";
        else if (n < 10)
            return units[n];
        else if (n >= 10 && n < 20)
            return teens[n - 10];
        else {
            int tenPlace = n / 10;
            int unitPlace = n % 10;
            return tens[tenPlace] + (unitPlace != 0 ? " " + units[unitPlace] : "");
        }
    }

    public static String numberToWords(int num) {
        if (num == 0)
            return "Zero";

        String words = "";

        // Thousands place
        if (num >= 1000) {
            int thousandPart = num / 1000;
            words += units[thousandPart] + " Thousand ";
            num %= 1000;
        }

        // Hundreds place
        if (num >= 100) {
            int hundredPart = num / 100;
            words += units[hundredPart] + " Hundred ";
            num %= 100;
        }

        // Tens and units place
        if (num > 0) {
            words += twoDigitToWords(num);
        }

        return words.trim();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (0 to 9999) to write in words: ");
        int num = s.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("Number out of supported range!");
            return;
        }

        String result = numberToWords(num);
        System.out.println("In words: " + result);
    }
}

/*
Sample Input 1:
1059

Sample Output 1:
In words: One Thousand Fifty Nine

Sample Input 2:
409

Sample Output 2:
In words: Four Hundred Nine

Sample Input 3:
0

Sample Output 3:
In words: Zero
*/
