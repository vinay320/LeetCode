class Solution {
    public int numDistinct(String s, String t) {
     int[][] dp=new int[t.length()+1][s.length()+1];
     
     for(int i=0;i<=s.length();i++)
     {
         dp[0][i]=1;
     }
        
     for(int i=1;i<s.length()+1;i++)
     {
         for(int j=1;j<t.length()+1;j++)
         {
             if(s.charAt(i-1)==t.charAt(j-1))
             {
                 dp[j][i]=dp[j][i-1]+dp[j-1][i-1];
             }
             else
             {
                 dp[j][i]=dp[j][i-1];
             }
         }
     }
        
        return dp[t.length()][s.length()];
        
    }
}

