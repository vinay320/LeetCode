class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        long max=0;
        long sum=0;
        int c=0;
        for(int i=0;i<k;i++)
        {   

                m.put(nums[i],m.getOrDefault(nums[i],0)+1);
                sum+=nums[i];
        }
        
        if(m.size()==k)
        {
            max=Math.max(max,sum);    
        }
        for(int i=k;i<nums.length;i++)
        {
            sum-=nums[c];
           
            sum+=nums[i];
            m.put(nums[c],m.get(nums[c])-1);
            if(m.get(nums[c])==0)
            {
                m.remove(nums[c]);
            }
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            if(m.size()==k)
            {
                max=Math.max(max,sum); 
            }
             c++;
        }
        
        return max;
    }
}