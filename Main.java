package LinkedList;

class Node {
    int data; // to store int data in this case (can be any data types)
    Node next; // pointer of type node to hold refernce to next node in the sequence

    //constructor to ceate instance of Node 
    Node (int data) {
        this.data = data; // set the data to whatever the data is passed in from parameter
        this.next = null; // initialize reference to be null
    }

   

    public static void main(String [] args ) {
         //create node instance
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        System.out.println(node1.data);
        System.out.println(node2.data);

    }

}