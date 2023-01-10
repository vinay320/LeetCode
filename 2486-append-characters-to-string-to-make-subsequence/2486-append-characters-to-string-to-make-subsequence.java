class Solution {
    public int appendCharacters(String s, String t) {
     
        int start=0, end=0, count=0;
        while(end < s.length()){
            if(start < t.length() && s.charAt(end) == t.charAt(start))
            {
                count++;
                start++;
            }
            end++;
        }
        return t.length()-count;
        
    }
}