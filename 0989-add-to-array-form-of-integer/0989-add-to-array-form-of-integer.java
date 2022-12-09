import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String x="";
        for(int i=0;i<num.length;i++)
        {
            x+=num[i];
        }
        BigInteger ans=new BigInteger(x);
         BigInteger ans1=new BigInteger(k+"");
         BigInteger ans2=ans.add(ans1);
        x=ans2.toString();
        char[] arr=x.toCharArray();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
           l.add(arr[i]-'0'); 
        }
        return l;
    }
}