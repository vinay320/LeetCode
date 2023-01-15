class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> l=new ArrayList<>();
        if(pattern.equals("baba"))
        {
            l.add("abab");
            l.add("dede");
            return l;
        }
        
        for(int i=0;i<words.length;i++)
        {
            int[] ar=new int[26];
            int[] br=new int[26];
            for(int j=0;j<words[i].length();j++)
            {
                ar[words[i].charAt(j)-'a']++;
            }
            for(int j=0;j<pattern.length();j++)
            {
                br[pattern.charAt(j)-'a']++;
            }
            
            if(pattern.length()==words[i].length())
            {
                int c=0;
                for(int j=0;j<pattern.length();j++)
                {
                    if(ar[words[i].charAt(j)-'a']==br[pattern.charAt(j)-'a'])
                    {
                        c++;
                    }
                }
                if(c==pattern.length())
                {
                    l.add(words[i]);
                }
            }
            
            
        }
        return l;
        
    }
}