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
        
        if(head==null || head.next==null)
        {
            return null;
        }
    
        ListNode dum=head;
        
        ListNode tcurr=dum;
        int i=0;
        while(tcurr!=null)
        {
            i++;
            tcurr=tcurr.next;
        }
        if(i==n)
        {
            return head.next;
        }
        i=i-n;
        while(i-->1)
        {
            dum=dum.next;
        }
        dum.next=dum.next.next;
        return head;
    }
}