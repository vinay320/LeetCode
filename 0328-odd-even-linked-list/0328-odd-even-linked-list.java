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
    public ListNode oddEvenList(ListNode head) {
         
        if (head == null || head.next == null)
        {
        return head;
        }
        ListNode odd=new ListNode(0);
        ListNode even=new ListNode(0);
        
        odd=head;
        even=head.next;
       
        
       
        ListNode l1=odd;
        ListNode l2=even;
         ListNode curr= even.next;
        
       
        int i=1;
        while(curr!=null)
        {
            if(i%2==0)
            {
                l2.next=curr;
                l2=curr;
                
                
            }
            else
            {
                l1.next=curr;
                l1=curr;
               
            }
             curr=curr.next;
            i++;
        }
        l1.next=null;
        l2.next=null;
        l1.next=even;
        return odd;
    }
}