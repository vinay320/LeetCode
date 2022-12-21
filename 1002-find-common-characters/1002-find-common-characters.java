class Solution {
    public List<String> commonChars(String[] words) {
       
      int[] count=new int[26];
        Arrays.fill(count,Integer.MAX_VALUE);
        
        for(String k:words)
        {
            int[] count2=new int[26];
            for(char ch:k.toCharArray())
            {
                count2[ch-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                count[i]=Math.min(count[i],count2[i]);
            }
        }
        
        List<String> s=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                s.add(""+(char)('a'+i));
            }
        }
        
        return s;
            
        
    }
}