class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(total<cost1 && total<cost2)
        {
            return 1;
        }
        long ans=0;
        int y=0;
        for(int i=0;;i++)
        {
            y=total-cost1*i;
            if(y<0)
                break;
            ans+=(long)Math.floor((y)/(long)(cost2))+1;
        }
        return ans;
    }
}