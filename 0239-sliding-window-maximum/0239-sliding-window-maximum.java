class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         int n = nums.length;
        int[] result = new int[n-k+1];
        Deque<Integer> q = new LinkedList<>();
        int j = 0;
        for(int i=0; i<n; i++){
            while(!q.isEmpty() && q.peek() < i-k+1)
                q.poll();
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i])
                q.pollLast();
            q.add(i);
            if(i>=k-1)
                result[j++] = nums[q.peek()];
        }
        return result;
    }
}