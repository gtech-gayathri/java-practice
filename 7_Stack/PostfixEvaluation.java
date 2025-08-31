import java.util.Scanner;

public class PostfixEvaluation {
    static class Stack {
        int[] arr;
        int top;
        int capacity;

        // Constructor
        Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        void push(int x) {
            arr[++top] = x;
        }

        int pop() {
            return arr[top--];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    // Function to evaluate a postfix expression
    public static int evaluatePostfix(String expression) {
        Stack stack = new Stack(expression.length());

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If operand, push to stack
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // convert char to int
            }
            // If operator, pop 2 elements and apply operator
            else {
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }

        return stack.pop(); // final result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix expression: ");
        String exp = sc.next();

        int result = evaluatePostfix(exp);
        System.out.println("Result = " + result);
    }
}

/*
Sample Input/Output:

Enter postfix expression: 231*+9-
Result = -4

Explanation:
Expression = 2 + (3*1) - 9
= 2 + 3 - 9
= -4
*/
