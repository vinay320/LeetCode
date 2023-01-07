class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
     int tnk=0;
        int total =0;
        int idx=0;
        for(int i=0;i<gas.length;i++)
        {
            int curr=gas[i]-cost[i];
            tnk+=curr;
            if(tnk<0)
            {
                idx=i+1;
                tnk=0;
            }
            total+=curr;
        }
        
        return total<0?-1:idx;
    }
}