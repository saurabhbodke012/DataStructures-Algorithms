package LinkedList;

public class Practice {

    public static ListNode insertAtBegin(ListNode head, int x){

        ListNode curr = new ListNode(x);
        curr.next = head;

        return curr;

    }

    public static ListNode insertAtPosition(ListNode head, int pos, int x){

        ListNode temp = new ListNode(x);

        if(pos == 1){
            temp.next =head;
            return temp;
        }

        ListNode curr= head;
        for(int i=1; i<pos-1 && curr.next!=null ; i++ ){
            curr= curr.next;
        }

        if(curr.next == null){
            return head;
        }

        temp.next = curr.next;
        curr.next = temp;

        return head;

    }


    public static ListNode insertAtEnd(ListNode head, int x){

        ListNode temp = new ListNode(x);

        if( head == null){
            return temp;
        }

        ListNode curr= head;

        while(curr.next != null){
            curr= curr.next;
        }

        curr.next = temp;

        return head;
    }

    public static ListNode deletetFirstNode(ListNode head){

        if( head == null){
            return head;
        }

        ListNode curr= head.next;
        return curr;
    }

    public static ListNode deleteTail(ListNode head){

        if( head == null || head.next == null){
            return null;
        }

        ListNode curr= head;

        while( curr.next.next != null){
            curr = curr.next;
        }

        curr.next =  null;
        return head;
    }







    public static void main(String args[])
    {
        ListNode head=null;
        head=insertAtEnd(head,30);
        head=insertAtEnd(head,20);
        head=insertAtEnd(head,10);
        System.out.println();

    }

}
