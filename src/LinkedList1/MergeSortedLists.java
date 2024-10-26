package LinkedList1;

public class MergeSortedLists {
    public static void main(String[] args) {
        LinkedList list1 = LinkedList.createLinkedList(new int[]{1, 3, 5});
        LinkedList list2 = LinkedList.createLinkedList(new int[]{2, 4 , 6});

        LinkedList res = merge(list1, list2);
        LinkedList.printList(res);
    }

    public static LinkedList merge(LinkedList list1, LinkedList list2) {
        // Create a dummy node to simplify the logic
        LinkedList dummy = new LinkedList(-1);
        LinkedList tail = dummy;

        // While both lists have nodes to compare
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                //Here we assign entire list1 to tail, which if tail updates then list1 will also update
                //But just after that we update list1 (tail is still not updated), to it's next element.
                tail.next = list1;
                list1 = list1.next;
            } else {
                //Here we assign entire list2 to tail, which if tail updates then list2 will also update
                //But just after that we update list2 (tail is still not updated), to it's next element.
                tail.next = list2;
                list2 = list2.next;
            }
            LinkedList.printList(tail);
            tail = tail.next;
        }

        // Attach the remaining nodes
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        // Return the next node of the dummy, which is the head of the merged list
        return dummy.next;
    }
}