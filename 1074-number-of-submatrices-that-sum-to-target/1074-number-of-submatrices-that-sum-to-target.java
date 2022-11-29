class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int sumRow[]=new int[n];
        int ans=0;
        for(int i=0;i<m;i++){
            Arrays.fill(sumRow,0);
            
            for(int j=i;j<m;j++){
                for(int k=0;k<n;k++){
                    sumRow[k]+=matrix[j][k];

                }
                ans+=subarraySum(sumRow,target);

            }
            
        }
        return ans;
    }

    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int ans=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
         sum+=nums[i];
         if(map.containsKey(sum-k)){
             ans+=map.get(sum-k);
         }
         map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}