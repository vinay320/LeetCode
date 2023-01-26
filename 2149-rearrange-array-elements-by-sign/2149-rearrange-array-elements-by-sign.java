class Solution {
    public int[] rearrangeArray(int[] nums) {
     int[] ans=new int[nums.length];
        int a=0;
        int b=1;
     for(int i=0;i<nums.length;i++)
     {
         if(nums[i]>0)
         {
             ans[a]=nums[i];
             a=a+2;
         }
         else
         {
             ans[b]=nums[i];
             b=b+2;
         }
     }
        return ans;
    }
}