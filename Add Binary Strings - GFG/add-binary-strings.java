//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            String b = input[1];
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a,b));
        }
    }
}
// } Driver Code Ends




class Solution {
    String addBinary(String A, String B) {
        java.math.BigInteger a=new java.math.BigInteger(A,2);
        java.math.BigInteger b=new java.math.BigInteger(B,2);
        a=a.add(b);
        return a.toString(2);
        
    }
}