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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
                 List<Integer> l2=new ArrayList(); 
         List<List<Integer>> l=new ArrayList<>();
                hasPathSum(root,targetSum,l2,l);    
        return l;
        
    }
 
    
    public void hasPathSum(TreeNode root, int targetSum,List<Integer> l2,List<List<Integer>> l) 
    {
     
        if(root==null)
        {
            return;
        }
        
        l2.add(root.val);
        
            if(root.left==null && root.right==null)
            {
                if(targetSum-root.val==0)
                 {
                l.add(new ArrayList(l2));
                    return;
                
                
            }
        }
        
        if(root.left!=null)
        {
         hasPathSum(root.left,targetSum-root.val,l2,l);
            l2.remove(l2.size()-1);
            
        }
        if(root.right!=null)
        {
         hasPathSum(root.right,targetSum-root.val,l2,l);
        l2.remove(l2.size()-1);
        }
         }
}