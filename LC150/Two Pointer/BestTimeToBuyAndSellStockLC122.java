//O(n),O(1)
class Solution {
    public int maxProfit(int[] prices) {

        int p = 0;
        int l = 0;
        int r = 1;

        while (r < prices.length) {
            // cal profit
            if (prices[l] < prices[r]) {
                p += prices[r] - prices[l];
            }
            // l will move forward as already calculated
            l++;
            r++;
        }
        return p;
    }
}
