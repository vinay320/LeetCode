class Solution {
    public String getHint(String secret, String guess) {
        int b=0;
        int c=0;
        
        int[] arr=new int[10];
        for(int i=0;i<secret.length();i++)
        {
            int x=secret.charAt(i)-'0';
            int y=guess.charAt(i)-'0';
            if(x==y)
            {
                b++;
            }
            else
            {
                if(arr[x]<0)
                {
                    c++;
                }
                if(arr[y]>0)
                {
                    c++;
                }
                arr[x]++;
                arr[y]--;
            }
        }
        
        return b+"A"+c+"B";
    }
}