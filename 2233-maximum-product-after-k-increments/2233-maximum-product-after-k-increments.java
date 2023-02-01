class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Long> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            q.add((long)nums[i]);
        }
        
        while(k>0)
        {
            long a=q.remove();
            q.add(a+1);
            k--;
        }
        
        long sum=1;
        while(q.size()!=0)
        {
            sum*=q.remove();
            sum=sum%1000000007;
        }
        
        return (int)sum;
        
    }
}