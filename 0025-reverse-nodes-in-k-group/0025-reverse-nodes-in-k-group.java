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
        Stack<Integer> st=new Stack<>();
        ListNode dum=new ListNode(0);
        ListNode tmp=dum;
        while(head!=null)
        {
            
                st.push(head.val);
            
                    
                if(st.size()==k)
                {
                    while(!st.isEmpty())
                    {
                        ListNode nn=new ListNode(st.pop());
                        tmp.next=nn;
                        tmp=tmp.next;
                    }
                }
            
            head=head.next;
        }
        ListNode extra=null;
        while(!st.isEmpty())
        {
            ListNode nn=new ListNode(st.pop());
            nn.next=extra;
            extra=nn;
            
        }
        tmp.next=extra;
        
        return dum.next;
    }
}