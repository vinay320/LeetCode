class Solution {
    public String addBinary(String a, String b) {
     int i=a.length()-1;
        int j=b.length()-1;
        String x="";
        String c="0";
        while(i>=0 && j>=0)
        {
            if(a.charAt(i)=='1' && b.charAt(j)=='1')
            {
                if(c.equals("0"))
                {
                    x="0"+x;
                    c="1";
                }
                else
                {
                    x="1"+x;
                    c="1";
                }
            }
            else if(a.charAt(i)=='1' && b.charAt(j)=='0' || a.charAt(i)=='0' && b.charAt(j)=='1')
            {
                if(c.equals("0"))
                {
                    x="1"+x;
                    c="0";
                }
                else
                {
                    x="0"+x;
                    c="1";
                }
            }
            else
            {
                if(c.equals("0"))
                {
                    x="0"+x;
                    c="0";
                }
                else
                {
                    x="1"+x;
                    c="0";
                }
            }
            i--;
            j--;
        }
        
        while(i>=0)
        {
            if(c.equals("1"))
            {
                if(a.charAt(i)=='1')
                {
                    x="0"+x;
                    c="1";
                }
                else
                {
                     x="1"+x;
                    c="0";
                }
            }
            else
            {   
                if(a.charAt(i)=='1')
                {
                     x="1"+x;
                    c="0";
                }
                else
                {
                    x="0"+x;
                    c="0";
                }
            }
            i--;
        }
        while(j>=0)
        {
            if(c.equals("1"))
            {
                if(b.charAt(j)=='1')
                {
                    x="0"+x;
                    c="1";
                }
                else
                {
                    x="1"+x;
                    c="0";
                }
            }
            else
            {   
                if(b.charAt(j)=='1')
                {
                    x="1"+x;
                    c="0";
                }
                else
                {
                    x="0"+x;
                    c="0";
                }
            }
            j--;
        }
        if(c.equals("1"))
        {
            x="1"+x;
        }
        return x;
    }
}