class Solution {
    public int partitionArray(int[] nums, int k) {
       // 1 2 3 5 6
        Arrays.sort(nums);
        int x=0;
        int y=0;
        int part=0;
        while(y<nums.length)
        {
            if(nums[y]-nums[x]>k)
            {
                part++;
                x=y;
            }
            y++;
            
            
        }
        return part+1;
    }
}