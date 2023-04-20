class Solution {
    public int minDistance(String w1, String w2) {
        int n=w1.length();
        int m=w2.length();
        int[][] dp=new int[n+1][m+1];
            
            for(int i=0;i<=n;i++)
            {
                dp[i][0]=i;
            }
        
            for(int i=0;i<=m;i++)
            {
                dp[0][i]=i;
            }
        
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=m;j++)
                {
                    if(w1.charAt(i-1)==w2.charAt(j-1))
                    {
                        dp[i][j]=dp[i-1][j-1];
                    }
                    else
                    {
                        int ins=dp[i][j-1];
                        int del=dp[i-1][j];
                        int rep=dp[i-1][j-1];
                        dp[i][j]=Math.min(ins,Math.min(del,rep))+1;
                    }
                }
            }
        
        return dp[n][m];
    }
   
    
    
    
}
