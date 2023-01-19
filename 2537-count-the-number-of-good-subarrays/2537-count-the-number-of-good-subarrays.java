class Solution {
    public long countGood(int[] nums, int k) {
        long ans=0;
        Map<Integer,Integer> m=new HashMap<>();
        int c=0;
        for(int i=0,j=0;j<nums.length;j++)
        {
            ans+=j+1;
            c+=m.getOrDefault(nums[j],0);
            m.put(nums[j],m.getOrDefault(nums[j],0)+1);
            while(c>=k)
            {
             m.put(nums[i],m.get(nums[i])-1);
                c-=m.get(nums[i]);
                i++;
            }
            ans-=(long)(j-i+1);
        }
        return ans;
    }
    
}