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
    public boolean isBalanced(TreeNode root) 
    {
        if(root==null)
        {
            return true;
        }
     
     boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        
        boolean self=Math.abs(height(root.left)-height(root.right))<=1;
        
        return left && right && self;
    }
    public int height(TreeNode root)
    {
        if(root==null)
        {
            return -1;
        }
        int x=height(root.left);
        int y=height(root.right);
        
        return Math.max(x,y)+1;
    }
}