//O(n),O(1)
class Solution {
    public int maxProfit(int[] prices) {

        int maxP = 0;

        int l = 0;
        int r = 1;

        while (r < prices.length) {
            // cal profit
            if (prices[l] < prices[r]) {
                int p = prices[r] - prices[l];
                maxP = p > maxP ? p : maxP;
            } else {
                // price is less so shift l to less
                l = r;
                // l++
            }
            r++;
        }
        return maxP;
    }
}
