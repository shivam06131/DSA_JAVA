package LinkedList1;

public class MiddleElement {
    public static void main(String[] args) {
        // Create linked list using an array
        Node head = Node.createLinkedList(new int[]{1, 2, 3, 4, 5, 6});

        // Print the linked list
        System.out.println("Initial List");
        Node.printList(head);
        Node middle = middleEle(head);
        System.out.println("Middle List");
        Node.printList(middle);

    }

    static Node middleEle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast.next!= null){
            slow = slow.next;
            if(fast.next.next == null){
                return slow;
            }
            fast = fast.next.next;
        }

        return slow;
    }
}

class Node {
    int val;
    Node next;

    // Constructor with value only
    Node(int val){
        this.val = val;
    }

    // Constructor with value and next node
    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        System.out.println("Printing Linked List");
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to create a linked list from an array
    public static Node createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;  // Handle empty array case
        }

        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
}