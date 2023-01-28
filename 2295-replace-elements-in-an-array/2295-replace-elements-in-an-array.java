class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],i);
        }
        
        for(int i=0;i<operations.length;i++)
        {
            nums[m.get(operations[i][0])]=operations[i][1];
            m.put(operations[i][1],m.get(operations[i][0]));
            m.remove(operations[i][0]);
        }
        return nums;
            
    }
}
