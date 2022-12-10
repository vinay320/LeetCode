class Solution {
    public int maxChunksToSorted(int[] arr) {
     
        int n = arr.length;
        int[] max = new int[n];
        max[0] = arr[0];
        for(int i=1; i<n; i++){
            max[i] = Math.max(max[i-1], arr[i]);
        }
        int c = 0;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            if(arr[i] == max[i]) c++;
        }
        return c;
        
    }
}