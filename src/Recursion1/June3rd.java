package Recursion1;

public class June3rd {

    public static June2nd.ListNode reverseList(June2nd.ListNode head) {

        June2nd.ListNode current = head;
        June2nd.ListNode previous = null;

        while(current!= null){
            June2nd.ListNode next = current.next;
            current.next= previous;
            previous= current;
            current= next;
        }

        return previous;
    }

    public static June2nd.ListNode reverseListRecurssion(June2nd.ListNode head) {

        if (head==null){
            return null;
        }

        June2nd.ListNode newHead= head;

        if(head.next != null){
            newHead =  reverseListRecurssion(head.next);
            head.next.next = head;
        }
        head.next = null;

        return newHead;

    }


}
