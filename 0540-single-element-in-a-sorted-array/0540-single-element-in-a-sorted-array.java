class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s=0;
        int l=nums.length-1;
        while(s<l)
        {
            int m=s+(l-s)/2;
            if(nums[m]==nums[m+1])
            {
                if((l-m)%2==0)
                {
                    s=m+2;
                }
                else
                {
                    l=m-1;
                }
            }
            else if(nums[m]==nums[m-1])
            {
                if((l-m)%2==0)
                {
                    l=m-2;
                }
                else
                {
                    s=m+1;
                }
            }
            else
            {
                return nums[m];
            }
        }
        return nums[s];
    }
}