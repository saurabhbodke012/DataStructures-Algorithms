package LinkedList;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        if( head == null){
            return true;
        }

        ListNode curr = head;

        ListNode firstHalf = firstHalfNode(head);
        ListNode secondHalf = firstHalf.next;

        ListNode first = head;
        ListNode reverseList = reverse(secondHalf);
        boolean flag = true;
        while( flag && reverseList != null ){

            if(first.val != reverseList.val){
                flag = false;
            }

            first = first.next;
            reverseList = reverseList.next;

        }

        firstHalf.next = reverse(reverseList);

        return flag;
    }


    public ListNode reverse(ListNode head){

        ListNode curr= head;
        ListNode prev= null;

        while( curr != null){

            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr= temp;

        }

        return prev;
    }


    public ListNode firstHalfNode(ListNode head){
        ListNode slow= head;
        ListNode fast= head;

        while( fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }


}
