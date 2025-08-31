import java.util.Scanner;

class MinStack {
    private int[] stack;        // main stack
    private int[] minStack;     // keeps track of minimums
    private int top;            // pointer for main stack
    private int minTop;         // pointer for min stack
    private int capacity;

    // Constructor
    public MinStack(int size) {
        capacity = size;
        stack = new int[size];
        minStack = new int[size];
        top = -1;
        minTop = -1;
    }

    // Push operation
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = x;

        // Maintain min stack
        if (minTop == -1 || x <= minStack[minTop]) {
            minStack[++minTop] = x;
        }
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }
        int removed = stack[top--];

        if (removed == minStack[minTop]) {
            minTop--; // remove from minStack also
        }
    }

    // Get Top element
    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    // Get Minimum element in O(1)
    public int getMin() {
        if (minTop == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return minStack[minTop];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create MinStack of user-given size
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        MinStack st = new MinStack(size);

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Get Min");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    st.push(val);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    System.out.println("Top element: " + st.top());
                    break;
                case 4:
                    System.out.println("Minimum element: " + st.getMin());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}


/*
================ SAMPLE INPUT/OUTPUT ================

Enter stack size: 5

Choose operation:
1. Push
2. Pop
3. Top
4. Get Min
5. Exit
Enter choice: 1
Enter value to push: 3

Enter choice: 1
Enter value to push: 5

Enter choice: 1
Enter value to push: 2

Enter choice: 1
Enter value to push: 1

Enter choice: 4
Minimum element: 1

Enter choice: 2   (Pop removes 1)

Enter choice: 4
Minimum element: 2

Enter choice: 3
Top element: 2

Enter choice: 5
Program exited.

=====================================================
*/
