class Solution {
    public String largestNumber(int[] nums) {
        String[] arr=new String[nums.length];
            for(int i=0;i<nums.length;i++)
            {
                arr[i]=nums[i]+"";
            }
        Arrays.sort(arr,(c,b)->(b+c).compareTo(c+b));
        String ans="";
        for(String i:arr)
        {
            ans+=i;
        }
        if(ans.charAt(0)=='0')
        {
            return "0";
        }
        return ans;
    }
}