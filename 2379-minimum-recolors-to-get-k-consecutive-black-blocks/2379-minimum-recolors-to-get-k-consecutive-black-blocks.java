class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int ans=k+1;
        for(int i=0;i<=blocks.length()-k;i++)
        {
            String a=blocks.substring(i,i+k);
            int m=a.split("W",-1).length-1;
            ans=Math.min(m,ans);
        }
        
        return ans;
        
    }
}
