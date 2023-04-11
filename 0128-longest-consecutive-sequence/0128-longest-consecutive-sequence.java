class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> m=new HashMap<>();
        for(int i:nums)
        {
            if(m.containsKey(i-1))
            {
                m.put(i,false);
            }
            else
            {
                m.put(i,true);
            }
            
            if(m.containsKey(i+1))
            {
                m.put(i+1,false);
            }
        }
        
        int ans=0;
        for(int i:m.keySet())
        {
            if(m.get(i)==true)
            {
                int c=0;
                while(m.containsKey(i))
                {
                    i++;
                    c++;
                }
                
                ans=Math.max(ans,c);
            }
        }
        
        return ans;
        
    }
}