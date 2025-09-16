import java.util.Scanner;

class Deque {
    int[] deque;
    int front, rear, capacity, size;

    // Constructor
    public Deque(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Check if deque is empty
    boolean isEmpty() {
        return size == 0;
    }

    // Check if deque is full
    boolean isFull() {
        return size == capacity;
    }

    // Insert element at front
    void insertFront(int value) {
        if (isFull()) {
            System.out.println("Deque is full!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity; // wrap around
        }
        deque[front] = value;
        size++;
        System.out.println(value + " inserted at front.");
    }

    // Insert element at rear
    void insertRear(int value) {
        if (isFull()) {
            System.out.println("Deque is full!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity; // wrap around
        }
        deque[rear] = value;
        size++;
        System.out.println(value + " inserted at rear.");
    }

    // Delete element from front
    int deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        int removed = deque[front];
        front = (front + 1) % capacity;
        size--;
        if (size == 0) front = rear = -1; // reset
        return removed;
    }

    // Delete element from rear
    int deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        int removed = deque[rear];
        rear = (rear - 1 + capacity) % capacity;
        size--;
        if (size == 0) front = rear = -1; // reset
        return removed;
    }

    // Display deque elements
    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }
        System.out.print("Deque: ");
        for (int i = 0; i < size; i++) {
            System.out.print(deque[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of deque: ");
        int size = sc.nextInt();

        Deque dq = new Deque(size);

        while (true) {
            System.out.println("\n1. Insert Front  2. Insert Rear  3. Delete Front  4. Delete Rear  5. Display  6. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert at front: ");
                    int valFront = sc.nextInt();
                    dq.insertFront(valFront);
                    break;
                case 2:
                    System.out.print("Enter element to insert at rear: ");
                    int valRear = sc.nextInt();
                    dq.insertRear(valRear);
                    break;
                case 3:
                    int removedFront = dq.deleteFront();
                    if (removedFront != -1) System.out.println("Deleted from front: " + removedFront);
                    break;
                case 4:
                    int removedRear = dq.deleteRear();
                    if (removedRear != -1) System.out.println("Deleted from rear: " + removedRear);
                    break;
                case 5:
                    dq.display();
                    break;
                case 6:
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

Enter size of deque: 5

1. Insert Front  2. Insert Rear  3. Delete Front  4. Delete Rear  5. Display  6. Exit
Choice: 2
Enter element to insert at rear: 10
10 inserted at rear.

Choice: 1
Enter element to insert at front: 5
5 inserted at front.

Choice: 5
Deque: 5 10 

Choice: 3
Deleted from front: 5

Choice: 4
Deleted from rear: 10

Choice: 6
Exiting...
*/
