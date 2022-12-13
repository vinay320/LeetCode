class Solution {
    public String removeOuterParentheses(String s) {
       Stack<Character> stk = new Stack<>();
        String ans = "";
        
        for(int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i) == '(')
            {
                stk.push(s.charAt(i));
                if(stk.size() > 1) 
               {
                    ans += s.charAt(i);
         
                }
            }
            else
            {
                if(stk.size() > 1) 
                {
                    ans += s.charAt(i);
                }
                stk.pop();
            }
        }
        
        return ans;
    }
}