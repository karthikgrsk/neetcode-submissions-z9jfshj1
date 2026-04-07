class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int mp = 0;
        for(int i=1;i<prices.length;i++){
            int p = prices[i] - min;
            mp = Math.max(p,mp);
            min = Math.min(min,prices[i]);
        }

        return mp;
    }
}
