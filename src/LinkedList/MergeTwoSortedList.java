package LinkedList;

public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        ListNode prev = new ListNode(0);

        ListNode list = prev;

        while ( ptr1 != null && ptr2 != null ){

            if ( ptr1.val >= ptr2.val){
                list.next = ptr2;
                ptr2 = ptr2.next;
            }else{
                list.next = ptr1;
                ptr1 = ptr1.next;
            }

            list = list.next;

        }

        list.next = ptr1 == null ? ptr2 : ptr1;

        return prev.next;

    }

}
