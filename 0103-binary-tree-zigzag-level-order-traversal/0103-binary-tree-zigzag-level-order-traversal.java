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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> sec=new ArrayList<>();
        Deque<TreeNode> dq=new LinkedList<>();
        if(root==null)
        {
            return sec;
        }
        dq.offer(root);
        boolean f=true;
        while(!dq.isEmpty())
        {
            List<Integer> fir=new ArrayList<>();
            int size=dq.size();
            while(size-->0)
            {
                if(f)
                {
                    TreeNode x=dq.pollLast();
                    fir.add(x.val);
                    if(x.left!=null)
                    {
                        dq.addFirst(x.left);
                    }
                    if(x.right!=null)
                    {
                        dq.addFirst(x.right);
                    }
                }
                else
                {
                    TreeNode x=dq.poll();
                    fir.add(x.val);
                    if(x.right!=null)
                    {
                        dq.offer(x.right);
                    }
                    if(x.left!=null)
                    {
                        dq.offer(x.left);
                    }
                }
            }
            f=!f;
            sec.add(new ArrayList(fir));
        }
        return sec;
    }
}