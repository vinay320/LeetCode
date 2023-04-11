class Solution {
    public int lengthOfLongestSubstring(String s) {
     if(s==null || s.length()==0)
     {
         return 0;
     }
        
     Set<Character> set=new HashSet<>();
     int i=0;
        int max=1;
        for(int j=0;j<s.length();j++)
        {
            char x=s.charAt(j);
            if(!set.contains(x))
            {
                set.add(x);
                max=Math.max(max,set.size());
            }
            else
            {
                while(i<j)
                {
                    if(s.charAt(i)==x)
                    {
                        i++;
                        break;
                    }
                    set.remove(s.charAt(i));
                    i++;
                }
            }
        }
        
        return max;
    }
}