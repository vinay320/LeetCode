class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                nums[i-1]*=2;
                nums[i]=0;
            }
        }
        
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                l.add(nums[i]);
            }
        }
        for(int i=0;i<l.size();i++)
        {
            nums[i]=l.get(i);
        }
        for(int i=l.size();i<nums.length;i++)
        {
            nums[i]=0;
        }
        return nums;
    }
}