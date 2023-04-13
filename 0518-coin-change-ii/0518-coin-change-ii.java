class Solution {
    public int change(int amount, int[] coins) {
        
        int[][] arr=new int[coins.length+1][amount+1];
        for(int j = 0; j <= amount; j++){
            arr[0][j] = 0;
        }
        for(int i = 0; i <= coins.length; i++){
            arr[i][0] = 1;
        }
        
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                if(coins[i-1]>j)
                {
                    arr[i][j]=arr[i-1][j];
                }
                else
                {
                    arr[i][j]=arr[i-1][j]+arr[i][j-coins[i-1]];
                }
            }
        }
        
        return arr[coins.length][amount];
        
    }
}