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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> l=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return l;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            int max=Integer.MIN_VALUE;
            while(size-->0)
            {
                TreeNode rv=q.poll();
                if(rv.left!=null)
                {
                    q.add(rv.left);
                }
                if(rv.right!=null)
                {
                    q.add(rv.right);
                }
                max=Math.max(max,rv.val);
                
            }
            l.add(max);
        }
        return l;
    }
}