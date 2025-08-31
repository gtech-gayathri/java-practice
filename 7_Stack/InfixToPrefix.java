import java.util.*;

public class InfixToPrefix {
    // Function to return precedence of operators
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Function to check if character is operator
    static boolean isOperator(char c) {
        return (!Character.isLetterOrDigit(c));
    }

    // Convert Infix to Postfix
    static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If operand, add to output
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If '(', push to stack
            else if (c == '(') {
                stack.push(c);
            }
            // If ')', pop until '('
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // remove '('
            }
            // Operator case
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Function to convert Infix to Prefix
    static String infixToPrefix(String exp) {
        // Step 1: Reverse the infix expression
        StringBuilder reversed = new StringBuilder(exp).reverse();
        char[] chars = reversed.toString().toCharArray();

        // Replace '(' with ')' and vice versa
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                chars[i] = ')';
            } else if (chars[i] == ')') {
                chars[i] = '(';
            }
        }

        // Step 2: Get postfix of reversed expression
        String postfix = infixToPostfix(new String(chars));

        // Step 3: Reverse postfix → prefix
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();

        String prefix = infixToPrefix(infix);
        System.out.println("Prefix expression: " + prefix);

        sc.close();
    }
}

/*
-------------------------------
Sample Input/Output
-------------------------------
Input:
(A-B/C)*(A/K-L)

Output:
*-A/BC-/AKL
-------------------------------

Input:
A+(B*C)

Output:
+ A * B C
-------------------------------
*/
