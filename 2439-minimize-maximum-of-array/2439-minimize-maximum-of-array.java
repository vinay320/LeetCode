class Solution {
    public int minimizeArrayValue(int[] nums) {
        int mx=0;
        long curr=0;
        for(int i=0;i<nums.length;i++)
        {
            curr+=nums[i];
            mx=(int)Math.max(mx,(curr+i)/(i+1));
        }
        return mx;
    }
}
