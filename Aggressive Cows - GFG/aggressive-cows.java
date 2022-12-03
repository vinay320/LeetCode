//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java


// User function Template for Java
class Solution {
    public static int solve(int n, int K, int[] arr) {Arrays.sort(arr);
        int start = 0;
        int max = -1;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
        }
        int end = max;
        int ans = -1;
        
        int mid = start + (end - start) / 2;
 
        while(start <= end){
            if(isPossibleSolution(arr, n, K, mid)){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
    public static boolean isPossibleSolution(int[] arr, int n, int K, int mid){
 
        int Count_cow = 1;
        int lastpos = arr[0];
 
        for (int i = 0; i < n; i++) {
 
            if(arr[i] - lastpos >= mid){
                Count_cow ++;
                if(Count_cow == K){
                    return true;
                }
                lastpos = arr[i];
            }
        }
        return false;
    }
    
}