import java.util.Scanner;

// Node class to store data and next pointer
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class using Linked List
class LinkedListQueue {
    Node front, rear;

    // Constructor
    LinkedListQueue() {
        front = rear = null;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == null;
    }

    // Add element to queue (enqueue)
    void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) { // queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value + " enqueued.");
    }

    // Remove element from queue (dequeue)
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = front.data;
        front = front.next;
        if (front == null) rear = null; // queue became empty
        return removed;
    }

    // Peek the front element
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    // Display all elements
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListQueue q = new LinkedListQueue();

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
