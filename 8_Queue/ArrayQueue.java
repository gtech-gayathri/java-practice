import java.util.Scanner;

class ArrayQueue {
    int[] queue;
    int front, rear, capacity;

    // Constructor
    public SimpleQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Check if queue is full
    boolean isFull() {
        return rear == capacity - 1;
    }

    // Add element to queue
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = value;
        System.out.println(value + " enqueued.");
    }

    // Remove element from queue
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front++];
    }

    // Display queue elements
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        SimpleQueue q = new SimpleQueue(size);

        while (true) {
            System.out.println("\n1. Enqueue  2. Dequeue  3. Display  4. Exit");
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
                    q.display();
                    break;
                case 4:
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

Enter queue size: 5

1. Enqueue  2. Dequeue  3. Display  4. Exit
Choice: 1
Enter element to enqueue: 10
10 enqueued.

1. Enqueue  2. Dequeue  3. Display  4. Exit
Choice: 1
Enter element to enqueue: 20
20 enqueued.

1. Enqueue  2. Dequeue  3. Display  4. Exit
Choice: 3
Queue: 10 20 

1. Enqueue  2. Dequeue  3. Display  4. Exit
Choice: 2
Dequeued: 10

1. Enqueue  2. Dequeue  3. Display  4. Exit
Choice: 3
Queue: 20 

1. Enqueue  2. Dequeue  3. Display  4. Exit
Choice: 4
Exiting...
*/
