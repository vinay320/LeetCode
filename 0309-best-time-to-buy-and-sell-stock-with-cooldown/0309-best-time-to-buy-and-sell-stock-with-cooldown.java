class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int buy=Integer.MIN_VALUE;
        int sell=Integer.MIN_VALUE;
        
        for(int i=0;i<prices.length;i++)
        {  
            int perv=sell;
            sell=buy+prices[i];
            buy=Math.max(buy,profit-prices[i]);
            profit=Math.max(profit,perv);
            
            
        }       
        return Math.max(sell,profit); 
    }
}