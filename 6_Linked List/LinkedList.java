class LinkedList {
    // Node structure for LinkedList
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head pointer of LinkedList
    Node head;

    // Insert node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If list is empty
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; // Add at the end
        }
    }

    // Traverse and print LinkedList
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Delete a node by value
    public void delete(int key) {
        Node temp = head, prev = null;

        // Case 1: Head node holds the key
        if (temp != null && temp.data == key) {
            head = temp.next; // Change head
            System.out.println("Deleted: " + key);
            return;
        }

        // Case 2: Search for the key
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key not found
        if (temp == null) {
            System.out.println("Key " + key + " not found.");
            return;
        }

        // Case 3: Key found, unlink the node
        prev.next = temp.next;
        System.out.println("Deleted: " + key);
    }

    // Main method to test
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert dynamically
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Traverse
        list.traverse();

        // Delete a node
        list.delete(20);
        list.traverse();

        list.delete(10);
        list.traverse();

        list.delete(50); // Trying to delete a non-existing node
        list.traverse();
    }
}

/*
---------------- SAMPLE INPUT & OUTPUT ----------------

Input:
Insert 10, 20, 30, 40
Traverse
Delete 20
Traverse
Delete 10
Traverse
Delete 50
Traverse

Output:
Linked List: 10 -> 20 -> 30 -> 40 -> NULL
Deleted: 20
Linked List: 10 -> 30 -> 40 -> NULL
Deleted: 10
Linked List: 30 -> 40 -> NULL
Key 50 not found.
Linked List: 30 -> 40 -> NULL

-------------------------------------------------------
*/
