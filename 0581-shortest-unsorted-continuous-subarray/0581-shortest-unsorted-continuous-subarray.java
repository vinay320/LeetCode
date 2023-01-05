class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int start = arr.length, end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        if(end - start >= 0)
        {
            return end - start + 1;
        }
        return 0;
    }
}