class Solution {
    public int minPatches(int[] nums, int n) {
        long m=1;
        int c=0;
        int i=0;
        while(m<=n)
        {
            if(i<nums.length && m>=nums[i])
            {
                m+=nums[i];
                i++;
            }
            else
            {
                m=m+m;
                c++;
            }
        }
        return c;
    }
}