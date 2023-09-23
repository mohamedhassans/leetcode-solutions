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
    public ListNode mergeKLists(ListNode[] lists) {
         PriorityQueue<Integer> q = new PriorityQueue<>();
            for (ListNode i : lists) {
                while (i != null) {
                    q.add(i.val);
                    i = i.next;
                }
            }
            ListNode ans = new ListNode();
            ListNode cur = ans;
            while (!q.isEmpty()) {
                cur.next = new ListNode(q.poll());
                cur = cur.next;
            }
            return ans.next;
            
            
    }
}