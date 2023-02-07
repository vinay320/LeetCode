class Solution {
    public int totalFruit(int[] fal) {
        
        Map<Integer,Integer> m=new HashMap<>();
        int l=0;
        int idx=0;
        int max=0;
        for(int i=0;i<fal.length;i++)
        {
            m.put(fal[i],m.getOrDefault(fal[i],0)+1);
            if(m.size()<=2)
            {
                int x=0;
                for(int mp:m.values())
                {
                    x+=mp;
                }
                max=Math.max(max,x);
            }
            else
            {
                while(m.size()>2)
                {
                    m.put(fal[idx],m.get(fal[idx])-1);
                    idx++;
                    if(m.get(fal[idx-1])==0)
                    {
                        m.remove(fal[idx-1]);
                    }
                }
            }
            
        }
        return max;
    }
}