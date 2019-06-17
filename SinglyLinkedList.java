public class SinglyLinkedList {
    // <----- Attributes ----->
    public Node head;

    // <----- Constructors ----->
    public SinglyLinkedList() {
        // Constructors
        this.head = null;
    }

    // <----- Methods ----->
    // Add node
    public void add(int value) {
        Node newNode = new Node(value);
        // Checks if head is null
        if (head == null) {
            head = newNode;
        // Else if htere are values
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    // Remove node
    public void remove() {
        Node runner = head;
        // Checks if head is null
        if (head == null) {

        // Else checks if the node after head is null, if true remove the head
        } else if (head.next == null) {
            head = null;

        // Else finds and removes the last node
        } else {
            while(runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        }
    }

    // Print all nodes
    public void printValues() {
        Node runner = head;

        // Checks if head is null
        if (head == null) {

        // Else checks if node after head is null, and prints the head
        } else if (head.next == null) {
            System.out.println(head.value);

        // Else iterate through the list and prints the values until the next node is null
        } else {
            while(runner.next != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
            System.out.println(runner.value);
        }
    }

    // Find a node with a specific value
    public String find(int value) {
        Node runner = head;
        // Counter for string return value
        int counter = 0;

        // If the head is null, return that the list is empty
        if (head == null) {
            return "There are no values in the list";

        // Else if the node after head is null, check to see if the head has the value
        } else if (head.next == null) {
            if (head.value == value) {
                return "Value found at node 0";
            } else {
                return "Value not found";
            }
        
        // Else look through all nodes in the list and try to find the value
        } else {
            while(runner.next != null) {
                if(runner.value == value) {
                    return "Value found at node " + counter;
                }
                runner = runner.next;
                counter++;
            }
            if(runner.value == value) {
                return "Value found at node " + counter;
            } else {
                return "Value not found";
            }
        }
    }
}