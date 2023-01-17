class Solution {
    public int differenceOfSum(int[] nums) {
        int ans=0;
        String s="";
        for(int i=0;i<nums.length;i++)
        {
            ans+=nums[i];
            s+=nums[i];
        }
        
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=s.charAt(i)-'0';
        }
        return Math.abs(sum-ans);
    }
}