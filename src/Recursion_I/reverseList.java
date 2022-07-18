package Recursion_I;

public class reverseList {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode curr= head;

        if(head.next != null){
            curr =  reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;

        return curr;

    }

}
