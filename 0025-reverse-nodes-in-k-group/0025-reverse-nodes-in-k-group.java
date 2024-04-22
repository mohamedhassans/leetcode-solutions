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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1){
            return head;
        }
        
        ListNode prev=null;
        
        while(prev==null||(prev.next!=null)){
            boolean ss=(prev==null);
            // prev=start;
            ListNode start= (prev==null)?head:prev.next;
            ListNode end=start;
            
            int i=1;
            
            
            
            
            for(;i<k&&end.next!=null;i++)
                end=end.next; 
            
            if(i!=k) break;
            
            
            
            ListNode clonestart=start;    
            
             
            
            ListNode tempprev=prev;
            
            while(start!=end){
            ListNode nextstart=start.next;
            start.next=tempprev;
            tempprev=start;
            start=nextstart;
            }
            
            
            clonestart.next=end.next;
            end.next=tempprev;
            // prev=
            
            if(ss) {head=end;
                   ss=false;}
            else{
                  prev.next=end;
            }
            prev=clonestart;
            
            
            

        }
        return head;
        
    }
}