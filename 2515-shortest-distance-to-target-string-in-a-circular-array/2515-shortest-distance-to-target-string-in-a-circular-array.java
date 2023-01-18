class Solution {
    public int closetTarget(String[] words, String target, int start) {
        int end=words.length;
        int mx=101;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals(target))
            {
                int a=(Math.abs(i-start))%words.length;
                int b=(Math.abs(end-a))%words.length;
                int x=Math.min(a,b);
                mx=Math.min(x,mx);
            }
        }
        
        
        
        return mx==101?-1:mx;
    }
    
    
}

