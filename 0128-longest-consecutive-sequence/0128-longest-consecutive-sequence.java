class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        
        
        int max=0;
        for(int i:nums)
        {
            if(!set.contains(i-1))
            {
                int curr=i;
                int c=1;
                while(set.contains(curr+1))
                {
                    curr+=1;
                    c+=1;
                }
                max=Math.max(max,c);
            }
        }
        
        return max;
        
    }
}