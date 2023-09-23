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
    public void reorderList(ListNode head) {
        int n=0;
        ListNode cur=head;
        while(cur!=null){
            n++;
            cur=cur.next;
        } 
        n=(n+1)/2;
        ListNode secondarr=head;
        while(n-->1){
          secondarr=  secondarr.next;
        }
        
        ListNode temp=secondarr.next;
        secondarr.next=null;
        secondarr=temp;
       

        //reverse secondarr 
        ListNode prev=null;
        cur=secondarr;
        while(cur!=null){
            ListNode temp1=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp1;
        }
        secondarr=prev;



          cur=head;

        while(secondarr!=null&&cur!=null){

            ListNode temp1=cur.next;
            ListNode tempsecondarr=secondarr.next;

            cur.next=secondarr;
            secondarr.next=temp1;
            cur=temp1;
            secondarr=tempsecondarr; 

        } 
        
    }
}