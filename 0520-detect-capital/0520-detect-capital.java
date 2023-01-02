class Solution {
    public boolean detectCapitalUse(String word) {
            int n=0;
            for(int i=0;i<word.length();i++)
            {
                if(word.charAt(i)>=65 && word.charAt(i)<=90 )
                {
                    n++;
                }
            }
        if(n==word.length() || n==0)
        {
            return true;
        }
        else if(n==1 && word.charAt(0)>=65 && word.charAt(0)<=90 )
        {
            return true;
        }
        return false;
    }
}