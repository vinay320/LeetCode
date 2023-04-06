class Solution {
    public int rob(int[] nums) {
        
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return rob(nums,0,dp);
    }
    
    public static int rob(int[] arr,int i,int[] dp)
    {
       if(i>=arr.length)
       {
           return 0;
       }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int r=arr[i]+rob(arr,i+2,dp);
        int dr=rob(arr,i+1,dp);
        return dp[i]=Math.max(r,dr);
    }
}