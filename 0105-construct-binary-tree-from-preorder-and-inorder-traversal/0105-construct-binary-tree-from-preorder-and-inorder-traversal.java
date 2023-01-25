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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return create(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1);
    }
    public TreeNode create(int[] in, int ilo, int ihi, int[] pre, int plo, int phi){
        if(ilo>ihi || plo > phi) {
            return null;
        }
        TreeNode nn = new TreeNode(pre[plo]);
        int idx = search(in, ilo, ihi, pre[plo]);
        int netEle = idx - ilo; //remaining net elements in preorder after first element
        nn.left = create(in, ilo, idx-1, pre, plo+1, plo+netEle);
        nn.right = create(in, idx+1, ihi, pre, plo+netEle+1, phi);
        return nn;
    }
    public int search(int[] in, int si, int ei, int item){
        for(int i=si; i<=ei; i++){
            if(in[i] == item) return i;
        }
        return -1;
    }
}