class Solution {
    public int maxSum(int[][] grid) {
     
        int n = grid.length;  
        int m = grid[0].length; 
        int res=0;
        for (int i=1; i<n-1; i++)
        { 
             for (int j=1; j<m-1; j++)
             { 
                 int sum = grid[i][j]; 
                 for (int k=j-1; k<=j+1;k++) 
                     sum+=grid[i-1][k]+grid[i+1][k]; 
                     res=Math.max(sum,res); 
                 
             }
        }
        return res; 
        
    }
}