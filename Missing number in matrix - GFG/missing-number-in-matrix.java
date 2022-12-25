//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            long ans = ob.MissingNo(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long  MissingNo(int[][] matrix)
    {
        // code here
        int n = matrix.length;
        long rsum[] = new long[n];
        long csum[] = new long[n];
        
        int ZeroX=0, ZeroY=0;
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                rsum[i] += matrix[i][j];
                csum[j] += matrix[i][j];
                if(matrix[i][j]==0)
                {
                    ZeroX=i;
                    ZeroY=j;
                }
            }
        }
        
        long d1 = 0; 
        long d2 = 0;
        
        for(int i=0; i<n; i++)
        {
            d1 += matrix[i][i];
            d2 += matrix[i][n-i-1];
        }
        
        boolean on_d1 = (ZeroX==ZeroY);
        boolean on_d2 = (ZeroX==(n-ZeroY-1));
        
        long ex_sum = -1;
        
        for(int i=0; i<n; i++)
        {
            if(i!=ZeroX && i!=ZeroY)
            {
                if(rsum[i]!=csum[i]) 
                    return -1;
                if(!on_d1 && rsum[i]!=d1 && !on_d2 && rsum[i]!=d2 && ex_sum>-1 && rsum[i]!=ex_sum) 
                    return -1;
                ex_sum = rsum[i];
                
            }
        }
        
        long ans = ex_sum - rsum[ZeroX];
        
        if(on_d1) 
            d1 += ans;
        if(on_d2) 
            d2 += ans;
        
        rsum[ZeroX] += ans;
        csum[ZeroY] += ans;
        
        if(d1!=d2 || rsum[ZeroX]!=csum[ZeroY] || ans<=0) 
            return -1;
        
        return ans;
    }
}