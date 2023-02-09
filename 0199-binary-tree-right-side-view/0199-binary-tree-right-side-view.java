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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> l=new ArrayList<>();
        if(root==null)
        {
            return l;    
        }
        int val=root.val;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size>0)
            {
                TreeNode x=q.poll();
                val=x.val;
                if(x.left!=null)
                {
                    q.add(x.left);
                }
                if(x.right!=null)
                {
                    q.add(x.right);
                }
                size--;
            }
            l.add(val);
        }
        
        return l;
        
    }
}