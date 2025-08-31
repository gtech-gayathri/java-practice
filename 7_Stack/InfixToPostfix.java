import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    // Function to return precedence of operators
    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3; // Exponent has highest precedence
        }
        return -1;
    }

    // Function to convert infix expression to postfix
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder(); // Stores final postfix expression
        Stack<Character> stack = new Stack<>();     // Stack to hold operators

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // Case 1: If character is an operand (a-z, A-Z, 0-9), add to result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // Case 2: If character is '(', push to stack
            else if (c == '(') {
                stack.push(c);
            }
            // Case 3: If character is ')', pop until '('
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Remove '('
            }
            // Case 4: Operator encountered
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all remaining operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input dynamically
        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();

        String postfix = infixToPostfix(infix);
        System.out.println("Postfix expression: " + postfix);

        sc.close();
    }
}

/*
-------------------- SAMPLE INPUT & OUTPUT --------------------

Input 1:
Enter infix expression: a+b*(c^d-e)^(f+g*h)-i

Output 1:
Postfix expression: abcd^e-fgh*+^*+i-

---------------------------------------------------------------

Input 2:
Enter infix expression: (A+B)*(C+D)

Output 2:
Postfix expression: AB+CD+*

---------------------------------------------------------------

Input 3:
Enter infix expression: A+(B*C-(D/E^F)*G)*H

Output 3:
Postfix expression: ABC*DEF^/G*-H*+

*/
