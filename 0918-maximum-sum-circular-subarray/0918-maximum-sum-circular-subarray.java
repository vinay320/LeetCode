class Solution {
    static int kdn(int[] nums)
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0)
            {
                sum=0;
            }
        }
        
        
        return max;
    }
        
    public int maxSubarraySumCircular(int[] nums) {
        int lsum=kdn(nums);
        int sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            nums[i]=-nums[i];
        }
        int rsum=kdn(nums);
            
        sum+=rsum;
        if(sum==0)
        {
            return lsum;
        }
        return Math.max(lsum,sum);
    }
}

// first caluculate linear sum
// then calculate sum of by changing sign
// if(sum==0)
// then return linear sum
