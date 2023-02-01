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
    TreeNode xp = null;
    TreeNode yp = null;
    int xD = -1, yD = -1;
    
    public boolean isCousins(TreeNode root, int x, int y) 
    {
        getDepthAndParent(root, x, y, 0, null);
        return xD == yD && (xp!=yp);
    }
  
    public void getDepthAndParent(TreeNode root, int x, int y, int depth, TreeNode parent){
        if(root == null)
        {
            return;
        }
        if(root.val == x)
        {
            xp = parent;
            xD = depth;
        }
        else if(root.val == y)
        {
            yp = parent;
            yD = depth;
        }       
        getDepthAndParent(root.left, x, y, depth + 1, root);
        getDepthAndParent(root.right, x, y, depth + 1, root);
    }
}