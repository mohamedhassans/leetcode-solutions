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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode ans=null;
        ListNode curans=null;

        int rem=0;

        while(cur1!=null||cur2!=null){
            int val1=0;
            int val2=0;
            if(cur1!=null){ val1=cur1.val;
            cur1=cur1.next;}
            if(cur2!=null){ val2=cur2.val;
            cur2=cur2.next;}
            int val=val1+val2+rem;
            
            

            rem=val/10;
            val%=10;

            ListNode curNode=new ListNode(val);

            if(ans==null) {ans=curNode;
            curans=ans;}
            else{
                ans.next=curNode;
                ans=ans.next;
            }
            

            

        }
        if(rem!=0){
            ListNode curNode=new ListNode(rem);
            ans.next=curNode;

        }
        return curans;

        
    }
}