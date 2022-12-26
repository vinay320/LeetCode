class Solution {
    public boolean canJump(int[] nums) {
       
        int i=nums.length-1;
        
        if(nums.length==1)
        {
            return true;
        }
        int idx=nums.length-1;
        while(i>=0)
        {
            if(i+nums[i]>=idx)
            {
                idx=i;
                
            }
            i--;
        }
        return idx==0;
            
    }
}