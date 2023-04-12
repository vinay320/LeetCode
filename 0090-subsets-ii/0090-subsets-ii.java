class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        subset(ans,nums,0,0,l);
            return new ArrayList<>(ans);
    }
    
    static void subset(Set<List<Integer>> ans,int[] arr,int x,int sum,List<Integer> l)
    {
        if(x==arr.length)
        {
            // Collections.sort(l);
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(arr[x]);
        subset(ans,arr,x+1,sum+arr[x],l);
        l.remove(l.size()-1);
        subset(ans,arr,x+1,sum,l);
    }
}