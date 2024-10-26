package LinkedList1;

public class Add2Numbers {
    public static void main(String[] args) {
        LinkedList l1 = LinkedList.createLinkedList(new int[]{2,4,3});
        LinkedList l2 = LinkedList.createLinkedList(new int[]{5,6,4});
        LinkedList result = addTwoNumbers(l1,l2);
        LinkedList.printList(result);
    }

    public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        LinkedList dummy = new LinkedList(-1);
        int sum =0;
        int carry = 0;
        LinkedList head2 = dummy;

        while (l1 != null || l2 != null || carry > 0){
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            dummy.next = new LinkedList(sum % 10);
            dummy = dummy.next;
            sum = 0;

        }

        return head2.next;
    }
}
