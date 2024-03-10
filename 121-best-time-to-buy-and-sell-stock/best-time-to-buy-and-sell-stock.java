class Solution {
    public int maxProfit(int[] prices) {
        int minPos = prices[0];
        int profit = 0;
        for(int i=0; i<prices.length; i++) {
            minPos = Math.min(minPos, prices[i]);
            profit = Math.max(profit, prices[i]-minPos);
        }
        return profit;
    }
}