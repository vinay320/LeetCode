class Solution {    
    public int minOperations(int[] nums, int[] numsDivide) {
        
        int hcf = findGCD(numsDivide);
        
        int count=0;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(hcf%nums[i]==0) return count;
            count++;
        }
        return -1;
    }
    
    int gcd(int a, int b){
        if (a == 0)  return b;
        return gcd(b % a, a);
    }
 
    int findGCD(int arr[]){
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
 
            if(result == 1){
               return 1;
            }
        }
        return result;
    }
}