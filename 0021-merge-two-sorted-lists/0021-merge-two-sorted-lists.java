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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return merge(list1,list2);
    }
    static ListNode merge(ListNode x,ListNode y)
    {
        if(x==null)
        {
            return y;
        }
        if(y==null)
        {
            return x;
        }
        
        if(x.val<y.val)
        {
            x.next=merge(x.next,y);
            return x;
        }
        
        y.next=merge(x,y.next);
        return y;
    }
}