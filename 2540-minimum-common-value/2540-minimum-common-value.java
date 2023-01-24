class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[] arr =new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k++]=nums1[i++];
            }
            else if(nums1[i]>nums2[j])
            {
                arr[k++]=nums2[j++];
            }
            else
            {
                return nums1[i];
            }
                
        }
        return -1;
    }
}