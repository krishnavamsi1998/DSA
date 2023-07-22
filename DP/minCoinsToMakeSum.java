//O(amount*no of coins),O(amount+1)
class Solution {
    public int coinChange(int[] coins, int amount) {
        
        // 1D array of size 0 to amount +1
        int dp[]=new int[amount+1];
        //fill dp with a max of amount +1
        for(int i=0;i<amount+1;i++)
            dp[i]=amount +1;

        // start bottom up approach
        // no of coints to make 0 is 0
        dp[0]=0;
        // fill the dp by trying out all the coins
        for(int i=1;i<amount+1;i++)
        {
            for(int j=0;j<coins.length;j++)
                {
                    // negative sum
                    if(i-coins[j]>=0)
                        dp[i]=Integer.min(dp[i],1+ dp[i-coins[j]]);
                }
        }
        // means there is no coin that will make sum to amount 
        if(dp[amount]==amount+1)
            return -1;
        return dp[amount];

    }
}
