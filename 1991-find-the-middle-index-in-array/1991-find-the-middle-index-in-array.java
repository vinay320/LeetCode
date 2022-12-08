class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length==1)
        {
            return 0;
        }
        int idx=-1;
        int[] aaa=new int[nums.length];
        aaa[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            aaa[i]=nums[i]+aaa[i-1];
        }
        
        int sum=aaa[nums.length-1];
        for(int i=0;i<nums.length;i++)
        {
            if(sum-aaa[i]==aaa[i]-nums[i])
            {
                return i;
            }
            
        }
        
        return idx;
    }
}