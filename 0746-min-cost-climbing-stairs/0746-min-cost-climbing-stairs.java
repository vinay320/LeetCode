class Solution {
    public int minCostClimbingStairs(int[] cost) {
       
        int n=cost.length;        
        int first=cost[0];
        int second=cost[1];
        
        for(int i=2;i<n;i++)
        {
            int res=Math.min(first,second)+cost[i];
            first=second;
            second=res;
        }
        return Math.min(first,second);
    }
}