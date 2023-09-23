/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode teamphead=head;
        if(head==null) return false;
        ListNode cur=head;
        ListNode prev=null;
int c=0;
        while(cur.next!=null){
            c++;
            ListNode tempnxt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=tempnxt;
        }

        return c!=0&& teamphead==cur;
        
    }
}