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
    public ListNode swapPairs(ListNode head) {
        
        if(head==null||head.next==null) return head;
        
        ListNode cur=head;
        ListNode nxt=head.next;
        
        head=nxt;
        cur.next=nxt.next;
        nxt.next=cur;
        
        ListNode prev=cur;
        
        
        while(true){
            cur=cur.next;
            if(cur==null) break;
            nxt=cur.next;
            if(nxt==null) break;
            
            prev.next=nxt;
            cur.next=nxt.next;
            nxt.next=cur;
            prev=cur;
            

            
        }
        return head;
        
        
    }
}