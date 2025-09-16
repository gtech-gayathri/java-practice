// Priority Queue (Min-Heap) using Array in Java

import java.util.Scanner;

class PriorityQueue {
    int[] heap;
    int size;
    int capacity;

    // Constructor
    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Get parent index
    int parent(int i) { return (i - 1) / 2; }

    // Get left child index
    int left(int i) { return 2 * i + 1; }

    // Get right child index
    int right(int i) { return 2 * i + 2; }

    // Swap two elements
    void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Insert element into priority queue (min-heap)
    void insert(int value) {
        if (size == capacity) {
            System.out.println("Priority Queue is full!");
            return;
        }
        heap[size] = value;
        int current = size;
        size++;

        // Heapify up
        while (current != 0 && heap[parent(current)] > heap[current]) {
            swap(current, parent(current));
            current = parent(current);
        }
        System.out.println(value + " inserted.");
    }

    // Remove minimum element (root of min-heap)
    int remove() {
        if (size == 0) {
            System.out.println("Priority Queue is empty!");
            return -1;
        }
        int removed = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return removed;
    }

    // Heapify down from index i
    void heapify(int i) {
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && heap[l] < heap[smallest]) smallest = l;
        if (r < size && heap[r] < heap[smallest]) smallest = r;

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    // Peek minimum element
    int peek() {
        if (size == 0) {
            System.out.println("Priority Queue is empty!");
            return -1;
        }
        return heap[0];
    }

    // Display heap array
    void display() {
        if (size == 0) {
            System.out.println("Priority Queue is empty!");
            return;
        }
        System.out.print("Priority Queue (Min-Heap): ");
        for (int i = 0; i < size; i++) System.out.print(heap[i] + " ");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity of priority queue: ");
        int capacity = sc.nextInt();

        PriorityQueue pq = new PriorityQueue(capacity);

        while (true) {
            System.out.println("\n1. Insert  2. Remove  3. Peek  4. Display  5. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int val = sc.nextInt();
                    pq.insert(val);
                    break;
                case 2:
                    int removed = pq.remove();
                    if (removed != -1) System.out.println("Removed element: " + removed);
                    break;
                case 3:
                    int front = pq.peek();
                    if (front != -1) System.out.println("Front element (min): " + front);
                    break;
                case 4:
                    pq.display();
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

Enter capacity of priority queue: 5

1. Insert  2. Remove  3. Peek  4. Display  5. Exit
Choice: 1
Enter element to insert: 30
30 inserted.

Choice: 1
Enter element to insert: 10
10 inserted.

Choice: 1
Enter element to insert: 20
20 inserted.

Choice: 4
Priority Queue (Min-Heap): 10 30 20 

Choice: 3
Front element (min): 10

Choice: 2
Removed element: 10

Choice: 4
Priority Queue (Min-Heap): 20 30

Choice: 5
Exiting...
*/
