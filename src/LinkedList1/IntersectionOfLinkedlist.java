package LinkedList1;

public class IntersectionOfLinkedlist {
    public static void main(String[] args) {


        LinkedList l1 = new LinkedList(4);
        l1.next = new LinkedList(1);
        l1.next.next = new LinkedList(8);
        l1.next.next.next = new LinkedList(4);
        l1.next.next.next.next = new LinkedList(5);

        LinkedList l2 = new LinkedList(5);
        l2.next = new LinkedList(6);
        l2.next.next = new LinkedList(1);
        l2.next.next.next = l1.next.next;

        LinkedList result = getIntersectionNode(l1,l2);
        LinkedList.printList(result);

    }

    public static LinkedList getIntersectionNode(LinkedList headA, LinkedList headB){
        LinkedList l1 = headA;
        LinkedList l2 = headB;

        System.out.println("l1 list");
        LinkedList.printList(l1);

        System.out.println("l2 list");
        LinkedList.printList(l2);

        int len1 = 0;
        int len2 = 0;

        while (l1 != null){
            l1 = l1.next;
            len1++;
        }

        while (l2 != null){
            l2 = l2.next;
            len2++;
        }

        System.out.println("len 1 " + len1);
        System.out.println("len 2 " + len2);
        int diff = 0;
        if(len2 > len1){
            diff = len2 - len1;
            l1 = headA;
            l2 = headB;
            int count = 0;
            while (count < diff){
                l1 = l1.next;
                count++;
            }

        }else {
            diff = len1 - len2;
            l1 = headA;
            l2 = headB;
            int count = 0;

            while (count < diff){
                l2 = l2.next;
                count++;
            }
        }

        LinkedList.printList(l1);
        LinkedList.printList(l2);

        while (l1 != l2 && l1 != null && l2 != null){
            l1 = l1.next;
            l2 = l2.next;
        }
        
        return l1;
    }
}
