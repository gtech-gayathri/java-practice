import java.util.Scanner;

// Node class for Linked List
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    private Node top; // top of the stack

    // Constructor
    public StackUsingLinkedList() {
        this.top = null;
    }

    // Push operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top; // new node points to old top
        top = newNode;      // new node becomes top
        System.out.println(value + " pushed into stack.");
    }

    // Pop operation
    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow! No element to pop.");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next; // move top to next node
        }
    }

    // Peek operation
    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }

    // Display operation
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        Scanner sc = new Scanner(System.in);

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

Enter your choice: 4
Stack elements: 30 20 10

Enter your choice: 3
Top element is: 30

Enter your choice: 2
30 popped from stack.

Enter your choice: 4
Stack elements: 20 10
-----------------------------------------------------
*/
