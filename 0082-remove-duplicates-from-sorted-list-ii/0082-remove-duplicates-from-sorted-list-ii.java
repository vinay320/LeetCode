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
    public ListNode deleteDuplicates(ListNode head) {
     Map<Integer,Integer> m=new HashMap<>();   
     
     ListNode curr=head;
        while(curr!=null)
        {
            m.put(curr.val,m.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }
     ListNode temp=new ListNode(-1000);
     ListNode demo=temp;
     ListNode aa=head;
     while(aa!=null)
     {
         if(m.get(aa.val)==1)
         {
             ListNode nn=new ListNode(aa.val);
             temp.next=nn;
             temp=temp.next;
         }
         aa=aa.next;
     }
        return demo.next;
    }
}