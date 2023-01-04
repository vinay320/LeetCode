class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int max=1;
        int ans=1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            }
            if(nums[i]-nums[i-1]<=1)
            {
                max++;
            }
            else
            {
                max=1;
            }
            ans=Math.max(max,ans);
        }
        
        return ans;
    }
}