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
    public ListNode reverseList(ListNode head) 
    {
            ListNode demo=null;
            
            ListNode curr=head;
            while(curr!=null)
            {
                ListNode nn=new ListNode(curr.val);
                nn.next=demo;
                demo=nn;
                curr=curr.next;
            }
        return demo;
    }
}