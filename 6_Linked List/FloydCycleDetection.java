import java.util.Scanner;

public class FloydCycleDetection {
    // Node class represents each element in the linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // head of the list

    // Insert a node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Display the linked list (works properly only if no cycle)
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Function to detect cycle using Floyd’s Algorithm
    public boolean hasCycle() {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // cycle detected
            }
        }
        return false;
    }

    // Create a cycle manually (last node points to a given position)
    public void createCycle(int position) {
        if (head == null || position <= 0) return;

        Node temp = head;
        Node cycleNode = null;
        int count = 1;

        // Find the node at the given position
        while (temp.next != null) {
            if (count == position) {
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }

        // Link last node to the cycleNode
        if (cycleNode != null) {
            temp.next = cycleNode;
        }
    }

    // Main method with dynamic input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FloydCycleDetection list = new FloydCycleDetection();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insert(data);
        }

        System.out.print("Do you want to create a cycle? (yes=1 / no=0): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter the position to link last node to (1-based index): ");
            int pos = sc.nextInt();
            list.createCycle(pos);
        }

        if (list.hasCycle()) {
            System.out.println("Cycle detected in the linked list!");
        } else {
            System.out.println("No cycle found in the linked list.");
            System.out.println("Linked List:");
            list.display();
        }

        sc.close();
    }
}

/* ✅ Sample Run 1 (Without Cycle)
Enter number of nodes: 5
Enter the elements:
1 2 3 4 5
Do you want to create a cycle? (yes=1 / no=0): 0
No cycle found in the linked list.
Linked List:
1 -> 2 -> 3 -> 4 -> 5 -> NULL*/
/*✅ Sample Run 2 (With Cycle)
Enter number of nodes: 5
Enter the elements:
10 20 30 40 50
Do you want to create a cycle? (yes=1 / no=0): 1
Enter the position to link last node to (1-based index): 2
Cycle detected in the linked list!*/




