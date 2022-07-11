package LinkedList;

import java.util.HashMap;

public class IntersectionOfLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode list1= headA;
        ListNode list2= headB;

        HashMap<ListNode, Integer> map = new HashMap<>();
        int index= 0;
        while (list1 != null) {
            map.put(list1, index);
            list1 = list1.next;
            index++;
        }

        while( list2 != null){

            if(map.containsKey(list2)){
                return list2;
            }

            list2= list2.next;
        }

        return null;

    }

}
