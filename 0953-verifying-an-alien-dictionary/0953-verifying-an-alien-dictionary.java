class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<order.length();i++)
        {
            m.put(order.charAt(i),i);
        }
        
        for(int j=0;j<words.length-1;j++)
        {
            
        for(int i=0;i<words[j].length();i++)
        {
             if (i >= words[j + 1].length()) return false;
            if(words[j].charAt(i)!=words[j+1].charAt(i))
            {
                if(m.get(words[j].charAt(i))>m.get(words[j+1].charAt(i)))
            {
                return false;
            }
                else
                {
                    break;
                }
            }
            
        }
        }
        
        return true;
    }
}