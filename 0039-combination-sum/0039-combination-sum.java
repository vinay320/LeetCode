class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        Gen(ans,l,arr,t,0);
        return ans;
        
    }
    
    static void Gen(List<List<Integer>> ans,List<Integer> l,int[] arr,int t,int idx)
    {
        if(idx==arr.length)
        {
            if(t==0)
            {
                ans.add(new ArrayList<>(l));
            }
            return;
        }
        
        if(t>=arr[idx])
        {
            l.add(arr[idx]);
            Gen(ans,l,arr,t-arr[idx],idx);
            l.remove(l.size()-1);
        }
      
            Gen(ans,l,arr,t,idx+1);
        
    }
}