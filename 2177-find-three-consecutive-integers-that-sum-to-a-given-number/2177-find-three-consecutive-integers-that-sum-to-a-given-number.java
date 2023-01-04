class Solution {
    public long[] sumOfThree(long num) {
        
        long[] ans=new long[3];
        long x=(long)Math.ceil(num/3);
        if((x-1+x+x+1)==num)
        {
            ans[0]=x-1;
            ans[1]=x;
            ans[2]=x+1; 
        }
        else
        {
            return new long[0];
        }
        
        return ans;
        
    }
}