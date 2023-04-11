class Solution {
    public int findDuplicate(int[] nums) {
        
        int val=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int x=-(nums[i]);
                if(nums[x]<0)
                {
                    val=x;
                }
                else
                {
                    nums[x]=-nums[x];
                }
            }
            else
            {
               if(nums[nums[i]]<0)
                {
                   val=nums[i];
                }
                else
                {
                    nums[nums[i]]=-nums[nums[i]];
                } 
            }
        }
        return val;
        
    }
}