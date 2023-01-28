class Solution {
    public boolean canChange(String s, String t) {
        if (!(s.replaceAll("_", "")).equals(t.replaceAll("_", ""))) 
        {
            return false;
        }
        ;
        for(int i=0,j=0;i<s.length() && j<s.length();i++,j++)
        {
            while(i<s.length() && s.charAt(i)=='_')
            {
                i++;
            }
            while(j<s.length() && t.charAt(j)=='_')
            {
                j++;
            }
        
            if(i<s.length() && j<s.length() && (s.charAt(i)=='L' && i<j || t.charAt(j)=='R' && i>j))
            {
                return false;
            }
            
            
        }
        return true;
    }
}