class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(int i=0;i<strs.length;i++)
        {
            if(onlyDigits(strs[i],strs[i].length()))
            {
                max=Math.max(Integer.parseInt(strs[i]),max);
            }
            else
            {
                max=Math.max(max,strs[i].length());
            }
        }
        return max;
        
    }
    public static boolean onlyDigits(String str, int n)
    {
 
        for (int i = 0; i < n; i++) {
      if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}