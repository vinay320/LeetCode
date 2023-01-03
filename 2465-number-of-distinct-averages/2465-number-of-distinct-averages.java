class Solution {
    public int distinctAverages(int[] nums) {
        
        List<Double> l=new ArrayList<>();
        double x=0;
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {   
            x=(nums[i]+nums[j])/2.0;
            if(!l.contains(x))
            {
                l.add(x);
            }
            i++;
            j--;
        }
        
        return l.size();
    }
}