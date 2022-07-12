package LinkedList;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode res= new ListNode(0);
        res.next = head;

        ListNode prev= res;

        while( curr != null){

            if(curr.val == val){
                prev.next = curr.next;
            }else{
                prev = curr;
            }

            curr= curr.next;

        }

        return res.next;
    }

}
