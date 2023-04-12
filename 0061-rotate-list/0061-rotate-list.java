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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode tmp=new ListNode(0);
        ListNode dum=tmp;
        
        tmp.next=head;
        ListNode curr=tmp;
        int c=0;
        while(curr.next!=null)
        {
            c++;
            curr=curr.next;
        }
        k=k%c;
        
        if(k==0)
        {
            return head;
        }
        
        int l=c-k;
        ListNode item=tmp;
        while(l-->0)
        {
            item=item.next;
        }
        curr.next=tmp.next;
        tmp=item.next;
        item.next=null;
        return tmp;
        
        
        
    }
}