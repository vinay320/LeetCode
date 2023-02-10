//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
         Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
         
         m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            
        }
        int count=0;
        String b="balloon";
        while(true)
        {
            int c=0;
            for(int i=0;i<b.length();i++)
            {
                if(m.containsKey(b.charAt(i)))
                {
                    c++;
                    m.put(b.charAt(i),m.get(b.charAt(i))-1);
                    if(m.get(b.charAt(i))==0)
                    {
                        m.remove(b.charAt(i));
                    }
                }
                else
                {
                    
                    break;
                }
            }
            if(c==b.length())
            {
                count++;
            }
            else
            {
                break;
            }
        }
        
        return count;
    }
}