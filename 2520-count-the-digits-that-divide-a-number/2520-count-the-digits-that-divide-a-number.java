class Solution {
    public int countDigits(int num) {
     int sum=num;
        int c=0;
        while(sum>0)
        {
            int r=sum%10;
            if(num%r==0)
            {
                c++;
            }
            sum/=10;
        }
        return c;
    }
}
