class Solution {
    public String gcdOfStrings(String str1, String str2) {
     
        String a=str1+str2;
        String b=str2+str1;
        
        if(a.equals(b))
        {
            
            int ll= gcd(str1.length(),str2.length());
            return str1.substring(0,ll);
            
            
        }
        return "";
        
    }
    
    static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}