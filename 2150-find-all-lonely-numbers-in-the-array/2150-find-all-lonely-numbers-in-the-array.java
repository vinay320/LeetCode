class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        
        List<Integer> l=new ArrayList<>();
        
        for (int num : m.keySet()) {
      
            if (m.get(num) == 1 && !m.containsKey(num - 1) && !m.containsKey(num + 1)) {
                l.add(num);
            }
        }
        return l;
    }
}