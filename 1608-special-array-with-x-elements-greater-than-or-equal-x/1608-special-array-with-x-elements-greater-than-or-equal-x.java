class Solution {
    public int specialArray(int[] nums) {
        return val(nums,nums.length);
    }
    static int val(int[] arr,int x)
    {
        if(x==0)
        {
            return -1;
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=x)
            {
                count++; 
            }
        }
        if(count == x){
            return x;
        }else{
            return val(arr,x-1);
        }
    }
}