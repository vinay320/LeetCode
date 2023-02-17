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
     int a=-1;
     int min=Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
       
        inorder(root);
        return min;
    }
     void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        if(a!=-1)
        {
            min=Math.min(min,root.val-a);
        }
       
            a=root.val;
        inorder(root.right);
    }
}