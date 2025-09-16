import java.util.Stack;
import java.util.Scanner;

class QueueUsingTwoStacks {
    Stack<Integer> stack1; // For enqueue operations
    Stack<Integer> stack2; // For dequeue operations

    // Constructor
    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Add element to queue
    void enqueue(int value) {
        stack1.push(value);
        System.out.println(value + " enqueued.");
    }

    // Remove element from queue
    int dequeue() {
        if (stack2.isEmpty()) {
            // Move all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        return stack2.pop();
    }

    // Peek front element
    int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        return stack2.peek();
    }

    // Display queue elements
    void display() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        // Move elements temporarily for display
        Stack<Integer> temp = new Stack<>();
        // First, elements in stack2 (front elements)
        for (int i = stack2.size() - 1; i >= 0; i--) {
            temp.push(stack2.get(i));
        }
        // Then elements in stack1 (rear elements)
        for (int i = 0; i < stack1.size(); i++) {
            temp.push(stack1.get(i));
        }

        System.out.print("Queue: ");
        while (!temp.isEmpty()) {
            System.out.print(temp.pop() + " ");
        }
        System.out.println();
    }

    // Main method to test queue
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();

        while (true) {
            System.out.println("\n1. Enqueue  2. Dequeue  3. Peek  4. Display  5. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    int removed = q.dequeue();
                    if (removed != -1) System.out.println("Dequeued: " + removed);
                    break;
                case 3:
                    int front = q.peek();
                    if (front != -1) System.out.println("Front element: " + front);
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

/*
Sample Input/Output:

1. Enqueue  2. Dequeue  3. Peek  4. Display  5. Exit
Choice: 1
Enter element to enqueue: 10
10 enqueued.

Choice: 1
Enter element to enqueue: 20
20 enqueued.

Choice: 4
Queue: 10 20 

Choice: 2
Dequeued: 10

Choice: 3
Front element: 20

Choice: 5
Exiting...
*/
