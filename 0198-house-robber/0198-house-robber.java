class Solution {
    public int rob(int[] nums) {
    
        return robB(nums);
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
    
    public static int robB(int[] arr)
    {
       if(arr.length==1)
       {
           return arr[0];
       }
         int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        
        for(int i=2;i<arr.length;i++)
        {
            int x=arr[i]+dp[i-2];
            int  y=dp[i-1];
            
            dp[i]=Math.max(x,y);
        }
        return dp[arr.length-1];
    }
}