class Solution {
    public int longestConsecutive(int[] arr) {
        Map<Integer,Boolean> m=new HashMap<>();
        
        // agar ek kam wala exist karta h to curr ko false krdo
        for(int i=0;i<arr.length;i++)
        {
            if(m.containsKey(arr[i]-1))
            {
                m.put(arr[i],false);
            }
            else
            {
                m.put(arr[i],true);
            }
            // agr ek jada wala exist karta h to jada wale ko false krdo
            if(m.containsKey(arr[i]+1))
            {
                m.put(arr[i]+1,false);
            }
        }
        
        int ans=0;
        for(int key:m.keySet())
        {
            if(m.get(key)==true)
            {
                int c=0;
                while(m.containsKey(key))
                {
                    c++;
                    key++;
                }
                 ans=Math.max(ans,c);
            }
           
        }
        return ans;
    }
}
