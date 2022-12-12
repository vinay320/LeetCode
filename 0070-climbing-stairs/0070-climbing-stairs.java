class Solution {
    public int climbStairs(int n) {
     
        if(n<3)
        {
            return n;
        }
        
        int a=1;
        int b=2;
        for(int i=2;i<n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
        }
        
        return b;
    }
}