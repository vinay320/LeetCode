//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        long sum=0;

        long xx=0;

        PriorityQueue<Integer>pq=new   PriorityQueue<>();

        for(int i=0;i<N;i++){

            pq.add(arr[i]);

            xx+=arr[i];

        }

        while(!pq.isEmpty()){

            int a=pq.peek();

            pq.remove();

            if(!pq.isEmpty())

            a=a+pq.peek();

            pq.add(a);

            pq.remove();

            sum+=a;

            

        }

        return sum-xx;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends