class Solution {
    public String largestWordCount(String[] mess, String[] send) {
        
        Map<String,Integer> m=new HashMap<>();
        for(int i=0;i<mess.length;i++)
        {
            String[] arr=mess[i].split(" ");
            m.put(send[i],m.getOrDefault(send[i],0)+arr.length);
        }
        
        String ans="";
        int max=0;
        Arrays.sort(send);
        for(int i=send.length-1;i>=0;i--)
        {
            if(m.get(send[i])>max)
            {
                ans=send[i];
                max=m.get(send[i]);
            }
        }
            
        return ans;
    }
}