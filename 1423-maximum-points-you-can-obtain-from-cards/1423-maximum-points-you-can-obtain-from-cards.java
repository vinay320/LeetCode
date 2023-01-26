class Solution {
    public int maxScore(int[] arr, int k) {
        int max=0;
        int curr=0;
        int n=arr.length;
        
        for(int i=0;i<k;i++)
        {
            curr+=arr[i];
        }
        max=curr;
        int j=n-1;
        for(int i=k-1;i>=0;i--)
        {
            curr=curr+arr[j]-arr[i];
            max=Math.max(max,curr);
            j--;
        }
        return max;
    }
}