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
    Node head; // Head of the linked list - right now it just a reference to the head
    Node tail;; // Tail of the lined list - right now it just a reference to the tail
    int size = 0; //store the size of link list

    // Add a new node to the end of the linked list
    public void add(int data) {
        Node newest = new Node(data);

        //we can set newest next pointer to null since it will now
        //become the last node in linklist
        newest.next = null;
        //lets first check if the node is empty or not
        if(head == null) {
            // if head is null than it means there is no node connected so
            //we let head point to the newest and becomes the first node
            head = newest;
            
           
        }else{
            //if it has 1 more node
            //set tails next to the newest node
            tail.next = newest;

            //set the tail to point to the newest so
            //it becomes the last elment
           
        }
        tail = newest; //we can set the tail to point to the newest so it become the newest
        size++;
       
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
        list.add(19);
        list.add(20);
        list.add(31);
        list.add(50);
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);
        System.out.println("Size: " + list.size);

    }
}
