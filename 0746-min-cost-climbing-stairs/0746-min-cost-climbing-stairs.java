class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;        
        int f=cost[0];
        int s=cost[1];
        
        for(int i=2;i<n;i++)
        {
            int res=Math.min(f,s)+cost[i];
            f=s;
            s=res;
        }
        return Math.min(f,s);
    }
}