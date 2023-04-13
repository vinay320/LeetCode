//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        Rat(m,ans,0,0,"");
        return ans;
    }
    static void Rat(int[][] arr,ArrayList<String> ans,int row,int col,String path)
    {
        if(row>=arr.length || col>=arr.length || row<0 || col<0|| arr[row][col]==0)
        {
            return;
        }
        if(row==arr.length-1 && col==arr.length-1)
        {
            // path+=arr[row][col];
            ans.add(path);
            return;
        }
        
        arr[row][col]=0;
        Rat(arr,ans,row+1,col,path+"D");
        Rat(arr,ans,row-1,col,path+"U");
        Rat(arr,ans,row,col-1,path+"L");
        Rat(arr,ans,row,col+1,path+"R");
        arr[row][col]=1;
    }
}