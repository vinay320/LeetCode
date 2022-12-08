class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
     
        int totalSum = 0;
      for(int i = arr.length - 1; i >= 0; i--)
        totalSum += arr[i];
      if(totalSum % 3 != 0) 
          return false;
      int partitionSum = totalSum / 3; 
      int currSum = 0;
      int partitionCount = 0;
      for(int i = 0; i < arr.length; i++) 
      {
        currSum += arr[i];
        if(currSum == partitionSum)
        {
          currSum = 0;
          partitionCount++;
        }
      }
      return partitionCount >= 3;
    }
}