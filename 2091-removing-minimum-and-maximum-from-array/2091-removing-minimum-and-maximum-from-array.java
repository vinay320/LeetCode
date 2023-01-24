class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1)
        {
            return 1;
        }
        int idx1=0;
        int idx2=0;
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                idx1=i;
                min=nums[i];
            }
            if(nums[i]>max)
            {
                idx2=i;
                max=nums[i];
            }
        }
        
        int ans=Math.max(idx1,idx2)+1;
        ans = Math.min(ans, Math.max(nums.length - idx1, nums.length - idx2));
        
        int l=Math.min(idx1,idx2);
        int r=Math.max(idx1,idx2);
        
        ans = Math.min(ans, l + 1 + nums.length - r); 
        
        return ans;
    }
}