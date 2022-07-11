package LinkedList;

public class LinkedList_Cycle_II {

    public ListNode detectCycle(ListNode head) {

        if(head == null){
            return null;
        }


        ListNode connect = helper(head);
        if(connect== null){
            return null;
        }


        ListNode index1= head;
        ListNode index2= connect;

        while( index1 != index2){

            index1= index1.next;
            index2= index2.next;
        }

        return index1;
    }


    public ListNode helper(ListNode head){

        ListNode slow= head;
        ListNode fast= head;

        while (slow != null && fast != null){
            slow= slow.next;
            fast= fast.next.next;

            if( slow == fast){
                return slow;
            }

        }

        return null;

    }

}
