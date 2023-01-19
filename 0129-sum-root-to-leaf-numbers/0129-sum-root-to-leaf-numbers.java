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
    public int sumNumbers(TreeNode root) 
    {
     return Sum(root,0);      
    }
    static int Sum(TreeNode root,int sum)
    {
        if(root==null)
        {
            return 0;
        }
        sum=10*sum+root.val;
        
        if(root.left==null && root.right==null)
        {
            return sum;
        }
        
        return Sum(root.left,sum)+Sum(root.right,sum);
        
    }
}