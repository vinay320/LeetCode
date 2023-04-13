class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ol=new ArrayList<>();
        List<Integer> inl=new ArrayList<>();
        Gen(ol,inl,nums);
        return ol;
    }
    
    static void Gen(List<List<Integer>> ol,List<Integer> inl,int[] nums)
    {
        if(inl.size()==nums.length)
        {
            ol.add(new ArrayList(inl));
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(inl.contains(nums[i])) 
                    continue;
                inl.add(nums[i]);
                Gen(ol,inl,nums);
                inl.remove(inl.size()-1);
            }
        }
    }
}