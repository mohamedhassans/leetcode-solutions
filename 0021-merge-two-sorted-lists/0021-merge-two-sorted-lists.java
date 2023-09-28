/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=null;
        ListNode  cursorted=null;
        if(list1==null&&list2==null) return null;

        while(list1!=null&&list2!=null){
            int val1=list1.val;
            int val2=list2.val;

            if(val1>val2){
                if(ans==null){
                    ans=list2;
                    cursorted=ans;
                    list2=list2.next;

                }
                else{
              ListNode nxt=list2.next;
              cursorted.next=list2;
              cursorted=cursorted.next;
              list2=nxt;

                }


            }
            else{

                if(ans==null){
                    ans=list1;
                    cursorted=ans;
                    list1=list1.next;

                }
                else{
                    ListNode nxt=list1.next;
              cursorted.next=list1;
              cursorted=cursorted.next;
              list1=nxt;
                }


            }


        }
        if(list1==null){
            if(cursorted==null) return list2;
            cursorted.next=list2;

        }
        else{
             if(cursorted==null) return list1;
           cursorted.next=list1;
        }
        return ans;
        
    }
}