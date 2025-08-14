import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256]; // For ASCII characters

        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}

/*
Sample Input/Output:
Enter a string: hello world
Character frequencies:
  : 1
d : 1
e : 1
h : 1
l : 3
o : 2
r : 1
w : 1
*/
