class Solution {
    public int tribonacci(int n) {
        
        int a=0;
        if(n==0)
        {
            return a;
        }
        int b=1;
        if(n==1)
        {
            return b;
        }
        int c=1;
        if(n==2)
        {
            return c;
        }
        int i=3;
        int sum=0;
        while(i<=n)
        {
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
            i++;
        }
        
        return c;
    }
}