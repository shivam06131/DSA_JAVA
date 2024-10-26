package LinkedList1;

public class rotateByK {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        ListNode result = rotateRight(head, 2);
        //ListNode result2 = rotateRight(head2,0);

        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode rotateRight(ListNode head, int k) {
        //calculate length.
        //attach head with tail.
        //find k, if k > length of array. (k % length)
        //find the step needed for saperation from head. (length - k)
        //move from head till the stepsNeeded and break the linked list.

        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode temp = head;
        int length = 1;

        while (temp.next != null){
            temp = temp.next;
            length = length + 1;
        }

        temp.next = head;

        if(k > length){
            k = k % length;
        }

        int stepsNeeded = length - k;
        temp = head;

        for(int i = 0; i<stepsNeeded;i++){
            i=i+1;
            temp = temp.next;
        }

        ListNode newHead = temp.next;
        temp.next = null;

        return newHead;

    }
}
