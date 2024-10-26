package LinkedList2;

import LinkedList1.LinkedList;

public class isPalindrome {
    public static void main(String[] args) {

        LinkedList head = LinkedList.createLinkedList(new int[]{1,2,3,2,1});
        boolean checkPalindromeResult = isPalindromeCheck(head);
        System.out.println("checkPalindromeResult " + checkPalindromeResult);
    }

    public static boolean isPalindromeCheck(LinkedList head){
        //Find first mid in even (in odd there will be only 1 mid)
        //Reverse the linked list after the mid.
        //Compare both first linked list and reversed linked list
        //Reverse the already reversed linked list and attach to first half
        LinkedList mid = findMid(head);
        LinkedList reversed = reverseLinkedList(mid.next);
        System.out.println("Mid " + mid.val);
        System.out.println("reversed ");
        LinkedList.printList(reversed);

        LinkedList l1 = head;
        LinkedList l2 = reversed;
        boolean isPalindrome = true;

        while (l2 != null){
            if(l1.val != l2.val){
                isPalindrome = false;
                break;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        mid.next = reverseLinkedList(reversed);
        return isPalindrome;
    }

    public static LinkedList findMid(LinkedList head){
        LinkedList fast = head;
        LinkedList slow = head;

        while (fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static LinkedList reverseLinkedList(LinkedList head){
        LinkedList prev = null;
        LinkedList curr = head;

        while (curr != null){
            LinkedList next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
