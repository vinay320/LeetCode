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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l=new ArrayList<>();
        sym(root,l,"");
        return l;
    }
    static void sym(TreeNode root,List<String> l,String ans)
    {
        if(root.left==null && root.right==null)
        {
            ans+=root.val;
            l.add(ans);
            return;
        }
        if(root.left!=null)
        {
            
            
            sym(root.left,l,ans+root.val+"->");
        }
        if(root.right!=null)
        {
            
            
            sym(root.right,l,ans+root.val+"->");
        }
        
    }
}