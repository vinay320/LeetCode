class Solution {
    public void rotate(int[][] arr) {
     
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int tp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=tp;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int tp=arr[i][j];
                arr[i][j]=arr[i][m-1-j];
                arr[i][m-1-j]=tp;
            }
        }
        
        
    }
}