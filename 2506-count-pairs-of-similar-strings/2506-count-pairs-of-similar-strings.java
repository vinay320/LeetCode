class Solution {
    public int similarPairs(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String x="";
            for(int j=0;j<ch.length;j++)
            {
                if(!x.contains(ch[j]+""))
                {
                    x+=ch[j];
                }
            }
            words[i]=x;
            
        }
        
        Arrays.sort(words);
        int c=1;
        int ans=0;
        for(int i=1;i<words.length;i++)
        {
            if(words[i].equals(words[i-1]))
            {
                c++;
            }
            else
            {
                ans+=((c)*(c-1))/2;
                c=1;
            }
        }
        if(c>1)
        {
            ans+=((c)*(c-1))/2;
        }
        
        
        return ans;
    }
}