package LinkedList1;

public class RemoveNthNode {
    public static void main(String[] args) {

        LinkedList head = LinkedList.createLinkedList(new int[]{1,2,3,4,5});
        LinkedList res = removeNthFromEnd(head,2);
        LinkedList.printList(res);
//
//        LinkedList head2 = LinkedList.createLinkedList(new int[]{1,2});
//        LinkedList res2 = removeNthFromEnd(head2,1);
//        LinkedList.printList(res2);

        LinkedList head3 = LinkedList.createLinkedList(new int[]{1});
        LinkedList res3 = removeNthFromEnd(head3,1);
        LinkedList.printList(res3);

    }

    public static LinkedList removeNthFromEnd(LinkedList head, int n) {
        LinkedList dummy = new LinkedList(-1);
        dummy.next = head;

        LinkedList fast = dummy;
        LinkedList slow = dummy;


        for(int i=0;i<=n;i++){
            fast = fast.next;
        }


        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        LinkedList temp = slow.next.next;
        slow.next = temp;

        return dummy.next;
    }
}
