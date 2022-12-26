class Solution {
    public int[] relativeSortArray(int[] A1, int[] A2) {
        int N=A1.length;
        int M=A2.length;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(A1[j]==A2[i])
                {
                    l.add(A1[j]);
                }
            }
        }
        
        ArrayList<Integer> l2=new ArrayList<>();
        
        for(int i=0;i<N;i++)
        {
            if(!l.contains(A1[i]))
            {
                l2.add(A1[i]);
            }
        }
        
        Collections.sort(l2);
        
        for(int i=0;i<l2.size();i++)
        {
            l.add(l2.get(i));
        }
        
        int[] ans=new int[l.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=l.get(i);
        }
        return ans;   
    }
}