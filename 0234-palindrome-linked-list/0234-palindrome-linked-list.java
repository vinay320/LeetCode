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
    public boolean isPalindrome(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        
        ListNode curr=head;
        s=reverseList(s);
        while(s!=null)
        {
            if(s.val!=curr.val)
            {
                return false;
            }
            s=s.next;
            curr=curr.next;
        }
        
        return true;
    }
    public static ListNode reverseList(ListNode head) 
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