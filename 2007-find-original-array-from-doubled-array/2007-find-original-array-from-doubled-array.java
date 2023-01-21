class Solution {
    public int[] findOriginalArray(int[] changed) {
       if(changed.length%2!=0)
       {
           return new int[]{};
       }
           
        int mid=changed.length/2;
        int[] ans=new int[mid];
        int[] frq=new int[100001];
        
        for(int i:changed)
        {
            frq[i]++;
        }
        int id=0;
        for(int i=0;i<frq.length;i++)
        {
            while(frq[i]>0 && i*2<100001 && frq[i*2]>0)
            {
                frq[i]--;
                frq[i*2]--;
                if(frq[i*2]<0)
                {
                    return new int[]{};
                }
                ans[id]=i;
                id++;
            }
        }
        for(int i:frq)
        {
            if(i!=0)
            {
                return new int[]{};
            }
        }
        return ans;
    }
}