class Solution {
    public String reverseStr(String s, int k) {
        
        if(k == 1) 
        {
            return s;
        }
        char[] Arr = s.toCharArray();
        int start = 0;
        int end = 0;
        for(int i = 0; i < Arr.length; i += (2 * k)) 
        {
            end = Math.min(i + k,Arr.length) - 1;
            start = i;
            
            while(start < end) 
            {
                char temp = Arr[start];
                Arr[start++] = Arr[end];
                Arr[end--] = temp;
            }
        }
        
        return new String(Arr);
    }
}