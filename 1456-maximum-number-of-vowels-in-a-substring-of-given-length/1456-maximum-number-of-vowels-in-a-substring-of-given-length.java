class Solution {
    public int maxVowels(String s, int k) 
    {       String v="aeiou";
        int ans=0;
        int count=0;
        int i=0;
        while(i<s.length() && i<k)
        {
            if (v.contains(s.charAt(i)+""))
            {
                count++;
            }    
            i++;
        }
     
        ans=Math.max(ans,count);
        while(i<s.length())
        {
            if (v.contains(s.charAt(i)+""))
                count++;
            if (v.contains(s.charAt(i-k)+""))
                count--;
            i++;
            ans=Math.max(ans,count);
        }
        return ans;
    }
}