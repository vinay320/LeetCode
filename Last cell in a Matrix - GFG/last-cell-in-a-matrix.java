//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
        out.close();
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]m, int R, int C){
        //code here
        int i = 0;
        int j = 0;
        int ans []= new int[2];
        char pos = 'r';
        while(i<R && j<C && i>=0 && j>=0){
            ans[0]=i;
            ans[1]=j;
            if(m[i][j]==0){
                if(pos=='r')j++;
                else if(pos=='d')i++;
                else if(pos=='l')j--;
                else if(pos=='u')i--;
            }
            else if(m[i][j]==1){
                m[i][j]=0;
                if(pos=='r')pos='d';
                else if(pos=='d')pos='l';
                else if(pos=='l')pos='u';
                else if(pos=='u')pos='r';
            }
        }
        return ans;
    }
}