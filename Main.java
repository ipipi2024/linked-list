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
    public void addAtEnd(int data) {
        Node newest = new Node(data);

        //we can set newest next pointer to null since it will now
        //become the last node in linklist
        // newest.next = null; We dont need to do this becuause it has been already initialize when instance was created
        //lets first check if the node is empty or not
        if(head == null) {
            // if head is null than it means there is no node connected so
            //we let head point to the newest and becomes the first node
            head = newest;
            tail = newest;
            
           
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

    //At the beginning or start
    public void addAtStart(int data) {
        //create a new node
        Node newest = new Node(data);
        //set the next pointer of new node to current head
        newest.next = head;
        //set the current head pointer to point to newest node
        head = newest;
        //increment the size of link list 
        size++;
    }

    //How to remove node at the begining
    public int removeAtStart() {
        int removedInt = head.data;
        head = head.next;
        // head.next = null; //taken care of by garbage collector
        return removedInt;
        
    }

    public int removeAtEnd() {
        int removedInt = tail.data;
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        tail = current;
        current.next = null;
        return removedInt;
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
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtStart(40);
        list.addAtStart(50);
       
        list.display();
        int removedInt = list.removeAtStart();
        System.out.println(removedInt);
        list.display();
        removedInt = list.removeAtEnd();
        System.out.println(removedInt);
        list.display();
       
    }
}
