class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] ar=new int[2001];
        for(int i=0;i<arr.length;i++)
        {
            ar[1000-arr[i]]++;
        }
        Arrays.sort(ar);
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]==ar[i+1] && ar[i]!=0 && ar[i+1]!=0)
            {
                return false;
            }
        }
        return true;
    }
}