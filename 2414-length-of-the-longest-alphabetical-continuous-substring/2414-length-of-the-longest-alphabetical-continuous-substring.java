class Solution {
    public int longestContinuousSubstring(String s) {
        String x="abcdefghijklmnopqrstuvwxyz";
        if(s.length()==1)
        {
            return 1;
        }
        int max=1;
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(stk.empty())
            {
                stk.push(s.charAt(i));
            }
            else
            {
                if(s.charAt(i)-stk.peek()==1)
                {
                    stk.push(s.charAt(i));
                    max=Math.max(max,stk.size());
                }
                else
                {
                    while(stk.size()>0)
                    {
                        stk.pop();
                    }
                    stk.push(s.charAt(i));
                }
            }
            
        }
        return max;
    }
}