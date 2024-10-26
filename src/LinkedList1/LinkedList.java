package LinkedList1;

public class LinkedList {
    public int val;
    public LinkedList next;

    // Constructor with value only
    public LinkedList(int val){
        this.val = val;
    }

    // Constructor with value and next node
    LinkedList(int val, LinkedList next){
        this.val = val;
        this.next = next;
    }

    // Function to print the linked list
    public static void printList(LinkedList head) {
        System.out.println("Printing linked list");
        LinkedList current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to create a linked list from an array
    public static LinkedList createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;  // Handle empty array case
        }

        LinkedList head = new LinkedList(arr[0]);
        LinkedList temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new LinkedList(arr[i]);
            temp = temp.next;
        }
        return head;
    }
}
