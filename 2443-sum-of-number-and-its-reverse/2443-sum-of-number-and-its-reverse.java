class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0)
        {
            return true;
        }
        for(int i=1;i<num;i++)
        {
        String s=""+i;
       StringBuilder str= new StringBuilder(s);
       StringBuilder x = str.reverse();
        
        int val=Integer.parseInt(x.toString());
            if((val+i)==num)
            {
                return true;
            }
        }
        return false;
    }
}