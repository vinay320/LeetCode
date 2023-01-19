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
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        
        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);
        
        int sl=height(root.left);
        int rl=height(root.right);
        int ans=sl+rl+2;
        return Math.max(l,Math.max(r,ans));
        
        
    }
    public int height(TreeNode root)
    {
        if(root==null)
        {
            return -1;
        }
        
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
}