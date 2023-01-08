class Solution {
    public int longestOnes(int[] nums, int k) {
     
        int n=nums.length;
        int si=0;
        int ei=0;
        int max=0;
        int x=0;
        while(ei<n)
        {
           if (nums[ei] == 0)
           {
              x++;   
           }
        
           if(x>k)
           {
               while(x>k && si<=ei) 
            {
                if (nums[si] == 0)
                {
                 x--;
                
                }si++;
            }
           }
            
            max=Math.max(max,ei-si+1);
            ei++;
        }
        return max;
    }
}