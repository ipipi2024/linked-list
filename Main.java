package LinkedList;

// Define the Node class
class Node {
    int data;       // Data stored in the node
    Node next;      // Reference to the next node

    // Constructor to initialize the node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define the LinkedList class
class LinkedList {
    Node head; // Head of the linked list

    // Add a new node to the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            Node current = head;
            while (current.next != null) { // Traverse to the end of the list
                current = current.next;
            }
            current.next = newNode; // Link the new node
        }
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class to test the LinkedList
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add nodes to the list
        list.add(10);
        list.add(20);
        list.add(30);

        // Display the list
        list.display();
    }
}
