import java.util.Scanner;

class CircularQueue {
    int[] queue;
    int front, rear, capacity, size;

    // Constructor
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    boolean isFull() {
        return size == capacity;
    }

    // Add element to queue
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1) front = 0; // first element
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println(value + " enqueued.");
    }

    // Remove element from queue
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = queue[front];
        front = (front + 1) % capacity;
        size--;
        if (size == 0) front = rear = -1; // reset if queue becomes empty
        return removed;
    }

    // Peek front element
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    // Display queue elements
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of circular queue: ");
        int size = sc.nextInt();

        CircularQueue q = new CircularQueue(size);

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

Enter size of circular queue: 5

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

Choice: 1
Enter element to enqueue: 30
30 enqueued.

Choice: 4
Queue: 20 30

Choice: 5
Exiting...
*/
