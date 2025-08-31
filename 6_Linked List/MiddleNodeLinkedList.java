import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleNodeLinkedList {

    // Function to insert node at end
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Function to find middle node
    public static Node findMiddle(Node head) {
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        // Move fast by 2 and slow by 1
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // slow is at the middle
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        System.out.println("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = insert(head, val);
        }

        Node middle = findMiddle(head);

        if (middle != null) {
            System.out.println("The middle node is: " + middle.data);
        } else {
            System.out.println("The list is empty.");
        }
    }
}

/*
---------------- SAMPLE INPUT/OUTPUT ----------------

Input:
Enter number of nodes: 
5
Enter elements:
10 20 30 40 50

Output:
The middle node is: 30

----------------------------------

Input:
Enter number of nodes: 
6
Enter elements:
1 2 3 4 5 6

Output:
The middle node is: 4

------------------------------------------------------
*/
