/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        Deque<TreeNode> dq=new LinkedList<>();
        if(root==null)
        {
            return l;
        }
        dq.offer(root);
        boolean flag=false;
        while(dq.size()!=0)
        {
            List<Integer> l2=new ArrayList<>();
            int size=dq.size();
            while(size--!=0)
            {
                if(flag)
                {
                    TreeNode head = dq.poll();
                    if(head.right!=null) 
                        dq.offer(head.right);
                    if(head.left!=null) 
                        dq.offer(head.left);
                    l2.add(head.val); 
                }
                else
                {
                    TreeNode head = dq.pollLast();
                    if(head.left!=null) 
                        dq.addFirst(head.left);
                    if(head.right!=null) 
                        dq.addFirst(head.right);
                 l2.add(head.val); 
                }               
                
            }
            flag=!flag;
            l.add(new ArrayList<>(l2));
        }
        return l;
    }
}