class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;
        while ( r< prices.length){
            if(prices[l]<prices[r]){
                int prof = prices[r] - prices[l];
                maxP = Math.max(maxP, prof);
            } else {
                l = r;
            }
            r++;

        }
        return maxP;
    }
}
