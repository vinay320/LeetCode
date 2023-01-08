class Solution {
    public int findGCD(int[] nums) {
        
        int a=nums[0];
        int b=nums[1];
        for(int i=0;i<nums.length;i++)
        {
            a=Math.max(a,nums[i]);
            b=Math.min(b,nums[i]);
            
        }
        while(a%b!=0)
        {
            int r=a%b;
            a=b;
            b=r;
        }
        return b;
    }
    
}