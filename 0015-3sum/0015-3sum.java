class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                if(-nums[i]==(nums[j]+nums[k]))
                {
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(new ArrayList<>(list));
                    j++;
                }
                else if(-nums[i]>(nums[j]+nums[k]))
                {
                 j++;   
                }
                else
                {
                    k--;
                }
            }
        }
        
        
        return new ArrayList<>(ans);
        
    }
}