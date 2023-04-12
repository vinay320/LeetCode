class Solution {
    public int removeDuplicates(int[] nums) {
        
        int x=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=nums[x-1])
            {
                int p=nums[x];
                nums[x]=nums[i];
                nums[i]=p;
                x++;
            }
            
        }
        return x;
    }
}