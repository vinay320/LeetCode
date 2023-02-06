class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int[nums.length];
        int i=0;
        int l=0;
        while(i<nums.length)
        {
            a[i]=nums[l];
            i=i+2;
            l++;
        }
        int k=1;
        int j=n;
        while(k<nums.length)
        {
            a[k]=nums[j];
            j++;
            k=k+2;
        }
        
        return a;
    }
}