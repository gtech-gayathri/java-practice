class ReverseLinkedList {
    // Node class represents each element in the linked list
    class Node {
        int data;     // stores data
        Node next;    // pointer to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    Node head;

    // Insert a node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // if list is empty, new node becomes head
        } else {
            Node temp = head;
            while (temp.next != null) { // traverse till last node
                temp = temp.next;
            }
            temp.next = newNode; // link new node at the end
        }
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Reverse the linked list (iterative approach)
    public void reverse() {
        Node prev = null;    // previous node
        Node current = head; // current node
        Node next = null;    // next node

        while (current != null) {
            next = current.next;  // store next node
            current.next = prev;  // reverse current node's pointer
            prev = current;       // move prev to current
            current = next;       // move current to next
        }
        head = prev; // update head to the new first node
    }

    // Main method to test the linked list reversal
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting elements into the list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original Linked List:");
        list.display(); // Before reversal

        // Reversing the list
        list.reverse();

        System.out.println("Reversed Linked List:");
        list.display(); // After reversal
    }
}

/*
-------------------- SAMPLE INPUT/OUTPUT --------------------

Input (Insertion Order):
10, 20, 30, 40, 50

Output:
Original Linked List:
10 -> 20 -> 30 -> 40 -> 50 -> NULL

Reversed Linked List:
50 -> 40 -> 30 -> 20 -> 10 -> NULL

--------------------------------------------------------------
*/
