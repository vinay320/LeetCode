class Solution {
   public List<List<Integer>> findSubsequences(int[] nums) {
    
    List<List<Integer>> result = new ArrayList<>();
    
    find(0, nums, result, new ArrayList<>());
    
    return result;
}

private void find( int i, int[] nums, List<List<Integer>> result, List<Integer> curr)
{
    
    if( curr.size() >= 2 ) 
    {
        result.add(new ArrayList<>(curr));
    }
    
    Set<Integer> set= new HashSet<>();
    
    for( int j = i; j < nums.length; j++ ){
        
        if( curr.size() == 0 || curr.get(curr.size()-1) <= nums[j] ){
            if( set.contains(nums[j]) ) 
                continue;
            set.add(nums[j]);
            curr.add(nums[j]);
            find(j+1, nums, result, curr);
            curr.remove(curr.size()-1);   
        }
    }
}
}