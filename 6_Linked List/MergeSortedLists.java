import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert element at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Merge two sorted linked lists
    public static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // Attach the remaining nodes
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }
}

public class MergeSortedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First list input
        LinkedList list1 = new LinkedList();
        System.out.print("Enter number of elements in first list: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of first sorted list:");
        for (int i = 0; i < n1; i++) {
            list1.insert(sc.nextInt());
        }

        // Second list input
        LinkedList list2 = new LinkedList();
        System.out.print("Enter number of elements in second list: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of second sorted list:");
        for (int i = 0; i < n2; i++) {
            list2.insert(sc.nextInt());
        }

        // Merging the lists
        Node mergedHead = LinkedList.merge(list1.head, list2.head);

        // Display merged list
        System.out.println("Merged Sorted List:");
        Node temp = mergedHead;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

/*
-------------------
Sample Input/Output
-------------------

Enter number of elements in first list: 3
Enter elements of first sorted list:
1 3 5
Enter number of elements in second list: 3
Enter elements of second sorted list:
2 4 6

Output:
Merged Sorted List:
1 2 3 4 5 6
*/
