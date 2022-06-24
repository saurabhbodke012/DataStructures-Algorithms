package Recursion1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class June24th {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head;

        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        if(list1.val < list2.val){
            head= list1;
            list1 = list1.next;
        }else{
            head= list2;
            list2 = list2.next;
        }

        head.next =  mergeTwoLists(list1,list2);

        return head;
    }

    public int kthGrammar(int n, int k) {
        if(n==1) return 0;
        if(k%2==0){
            if (kthGrammar(n-1,k/2)==0){
                return 1;
            }else {
                return 0;
            }
        }
        else{
            if(kthGrammar(n-1,(k+1)/2)==0) {
                return 0;
            }else{
                return 1;
            }
        }
    }

}
