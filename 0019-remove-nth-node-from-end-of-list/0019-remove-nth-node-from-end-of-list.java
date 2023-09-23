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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr1=head;
        int c=0;
        while(ptr1!=null){ c++;
        ptr1=ptr1.next;
        }

        c=c-n;
        if(c==0){
            head=head.next;
             
        }
        else{
        ListNode prev=head;
        ListNode cur=head.next;

        while(c-->1){
            prev=cur;
            cur=cur.next;
        }

        prev.next=cur.next;
        


        
        }
return head;
        
    }
}