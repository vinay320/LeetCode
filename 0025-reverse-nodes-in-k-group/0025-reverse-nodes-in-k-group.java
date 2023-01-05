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
    public ListNode reverseKGroup(ListNode node, int k) {
        
        Stack<ListNode> st=new Stack<>();
        ListNode dumm=new ListNode();
        ListNode tmp=dumm;
        ListNode start=null;
        
        while(node!=null)
        {
            if(st.size()==0)
            {
                start=node;
            }
            st.push(node);
            if(st.size()==k)
            {
                while(!st.empty())
                {
                    ListNode nn=new ListNode(st.pop().val);
                    dumm.next=nn;
                    dumm=dumm.next;
                }
            }
            node=node.next;
        }
        
        if(st.size()>0)
        {
            dumm.next=start;
        }
        
        return tmp.next;
        
    }
}