package LinkedList2;

import LinkedList1.LinkedList;

public class ReverseByK {
    public static void main(String[] args) {
        LinkedList list = LinkedList.createLinkedList(new int[]{1, 2, 3, 4, 5});
        LinkedList res = reverse(list, 2);
        LinkedList.printList(res);
    }

    static LinkedList reverse(LinkedList head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        LinkedList dummy = new LinkedList(-1);
        dummy.next = head;
        LinkedList prevGroupEnd = dummy;
        LinkedList current = head;

        while (current != null) {
            // Find the tail of the current k-group
            LinkedList groupStart = current;
            LinkedList groupEnd = current;
            int count = 1;
            while (count < k && groupEnd.next != null) {
                groupEnd = groupEnd.next;
                count++;
            }

            System.out.println("count here " + count);

            // If we found a full group, reverse it
            if (count == k) {
                LinkedList nextGroupStart = groupEnd.next;
                groupEnd.next = null; // Temporarily break the list

                // Reverse the current group
                prevGroupEnd.next = reverseGroup(groupStart);

                // Connect the reversed group back to the list
                groupStart.next = nextGroupStart;

                // Move to the next group
                prevGroupEnd = groupStart;
                current = nextGroupStart;
            } else {
                // If fewer than k nodes remain, no reversal is needed
                break;
            }
        }

        return dummy.next;
    }

    // Helper method to reverse a list segment
    static LinkedList reverseGroup(LinkedList head) {
        LinkedList prev = null;
        LinkedList current = head;

        while (current != null) {
            LinkedList next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}