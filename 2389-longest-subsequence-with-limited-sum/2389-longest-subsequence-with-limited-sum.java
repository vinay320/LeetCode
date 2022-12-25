class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
     Arrays.sort(nums);
        int[] ans=new int[queries.length];
        
        for(int i=0;i<queries.length;i++)
        {
            int c=0;
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(c+nums[j]<=queries[i])
                {
                    c=c+nums[j];
                    count++;
                }
                
            }
            ans[i]=count;
                
        }
        
        return ans;
    }
}