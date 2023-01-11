class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%6==0)
            {
                sum+=nums[i];
                c++;
            }
        }
        
        return sum==0?0:sum/c;
    }
}