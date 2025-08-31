import java.util.Scanner;

public class StackUsingArray {

    private int[] stack;  // stack array
    private int top;      // points to top element
    private int maxSize;  // size given by user at runtime

    // Constructor to initialize stack with user-defined size
    public StackUsingArrayDynamic(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No element to pop.");
        } else {
            System.out.println(stack[top--] + " popped from stack.");
        }
    }

    // Peek (top element)
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    // Display all elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take stack size dynamically
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();

        StackUsingArrayDynamic s = new StackUsingArrayDynamic(size);

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    s.push(value);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}


/* 
---------------- SAMPLE INPUT/OUTPUT ----------------

Enter the size of the stack: 3

--- Stack Menu ---
1. Push
2. Pop
3. Peek
4. Display
5. Exit
Enter your choice: 1
Enter value to push: 10
10 pushed into stack.

Enter your choice: 1
Enter value to push: 20
20 pushed into stack.

Enter your choice: 1
Enter value to push: 30
30 pushed into stack.

Enter your choice: 1
Enter value to push: 40
Stack Overflow! Cannot push 40

Enter your choice: 4
Stack elements: 10 20 30

Enter your choice: 2
30 popped from stack.

Enter your choice: 3
Top element is: 20
-----------------------------------------------------
*/
