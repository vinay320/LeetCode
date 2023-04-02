class Solution {
    public String minWindow(String s, String p) {
        String ans="";
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            m.put(p.charAt(i),m.getOrDefault(p.charAt(i),0)+1);
        }
        
        int mct=0;
        int dmct=p.length();
        
        HashMap<Character,Integer> m1=new HashMap<>();
        int i=-1;
        int j=-1;
        while(true)
        {
            boolean f1=false;
            boolean f2=false;
            while(i<s.length()-1 && mct<dmct)
            {
                i++;
                m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
                
                if(m1.getOrDefault(s.charAt(i),0)<=m.getOrDefault(s.charAt(i),0))
                {
                    mct++;
                }
                f1=true;
            }
            
            while(j<i && mct==dmct)
            {
                String pans=s.substring(j+1,i+1); 
                if(ans.length()==0 || pans.length()<ans.length())
                {
                    ans=pans;
                }
                
                j++;
                char ch=s.charAt(j);
                if(m1.get(ch)==1)
                {
                    m1.remove(ch);
                }
                else
                {
                    m1.put(ch,m1.get(ch)-1);
                }
                
                if(m1.getOrDefault(ch,0)<m.getOrDefault(ch,0))
                {
                    mct--;
                }
                
                f2=true;
                
            }
            
            if(f1==false && f2==false)
            {
                break;
            }
        }
        
        return ans;
    }
}