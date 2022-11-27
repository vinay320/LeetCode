class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3){
	return 0;
}
HashMap<Long, Integer>[] dp = new HashMap[nums.length];
for(int i = 0; i < nums.length; i++){
	dp[i] = new HashMap<>();
}
int sum = 0;
dp[1].put(((long)nums[1] - (long)nums[0]), 1);
for(int i = 2; i < nums.length; i++){
	for(int j = 0; j < i; j++){
		long diff = (long)nums[i] - (long)nums[j];
		if(dp[j].containsKey(diff)){
			sum+= dp[j].get(diff);
		}
		dp[i].put(diff, dp[i].getOrDefault(diff, 0) + dp[j].getOrDefault(diff, 0) + 1);
	}
}
return sum;
    }
}