class Solution {
    public String longestPrefix(String s) {
        if (s.length() <= 1)
            return "";
        
        int[] arr = new int[s.length()];
        int len = 0;
        int i = 1;
        arr[0] = 0;
        
        while (i < s.length()) 
        {
            if (s.charAt(i) == s.charAt(len)) 
            {
                arr[i++] = ++len;
            } else {
                if (len != 0)
                    len = arr[len - 1];
                else 
                    arr[i++] = 0;
            }
        }
        
        
        return s.substring(0, arr[arr.length-1]);
    }
}