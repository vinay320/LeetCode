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
    public List<List<Integer>> levelOrder(TreeNode root) {
         Queue<TreeNode> q=new LinkedList<>();
         Queue<TreeNode> q1=new LinkedList<>();
        if(root==null)
        {
            
        }
        q.add(root);
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> l2=new ArrayList<>();
        if(root==null)
        {
            return l2;
        }
        while(!q.isEmpty())
        {
            TreeNode x=q.remove();
            l.add(x.val);
            if(x.left!=null)
            {
                q1.add(x.left);
            }
            if(x.right!=null)
            {
                q1.add(x.right);
            }
            
            if(q.isEmpty())
            {
                l2.add(l);
                l=new ArrayList<>();
                q=q1;
                q1=new LinkedList<>();
            }
        }
        return l2;
    }
}