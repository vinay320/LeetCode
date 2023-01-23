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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
     Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> q1=new LinkedList<>();
        q.add(root);
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> l1=new ArrayList<>();
        if(root==null)
        {
            return l1;
        }
        while(q.size()!=0)
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
            if(q.size()==0)
            {
                l1.add(l);
                l=new ArrayList<>();
                q=q1;
                q1=new LinkedList<>();
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=l1.size()-1;i>=0;i--)
        {
            ans.add(l1.get(i));
        }
        return ans;   
    }
}