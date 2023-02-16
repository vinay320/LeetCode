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
    static int move=0;
    public int distributeCoins(TreeNode root) {
        move=0;
        coin(root);
        
        return move;
        
    }
    
    static int coin(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int left=coin(root.left);
        int right=coin(root.right);
        move+=Math.abs(right)+Math.abs(left);
        
        return left+right+root.val-1;
    }
}