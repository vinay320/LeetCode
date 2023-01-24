class Solution {
    public String removeStars(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='*')
            {
                stk.push(s.charAt(i));
            }
            else
            {
                if(s.charAt(i)=='*')
                {
                    stk.pop();
                }
            }
            
            
        }
        String ans="";
        while(stk.size()>0)
        {
            ans=stk.pop()+ans;
        }
        return ans;
    }
}