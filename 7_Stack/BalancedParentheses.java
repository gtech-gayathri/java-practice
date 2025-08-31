import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    // Function to check if parentheses are balanced
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // If it's an opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty, unbalanced
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                // Check if matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // Expression is balanced only if stack is empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an expression with brackets: ");
        String expression = sc.nextLine();

        if (isBalanced(expression)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}

/*
-------------------------
Sample Input/Output
-------------------------
Input 1: ({[]})
Output 1: Balanced

Input 2: (([{}]))
Output 2: Balanced

Input 3: ([)]
Output 3: Not Balanced

Input 4: ((())
Output 4: Not Balanced
*/
