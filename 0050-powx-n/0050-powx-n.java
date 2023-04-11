class Solution {
    public double myPow(double x, int n) {
     double ans=1.0;
        boolean flg=n<0?true:false;
        long xa=n;
        if(n<0)
        {
            xa=-xa;
        }
        while(xa>0)
        {
            if(xa%2==0)
            {
                x=x*x;
                xa=xa/2;
            }
            else
            {
                ans=ans*x;
                xa=xa-1;
            }
        }
        
        if(n<0)
        {
            ans=(double)1/ans;
        }
        return ans;
    }
}