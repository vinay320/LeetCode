//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int f=0;
        int t=0;
        int tw=0;
        for(int i:bills)
        {
            if(i==5)
            {
                f++;
            }
            else if(i==10)
            {
                f--;
                t++;
                
            }
            else
            {
                if(t>0)
                {
                    t--;
                    if(f>0)
                    {
                        f--;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    if((f-3)>=0)
                    {
                        f=f-3;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            if(t<0 || f<0)
            {
                return false;
            }
        }
        return true;
    }
}
