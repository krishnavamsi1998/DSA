//O(n),O(1)
//neetcode
class Solution {
    public int arrangeCoins(int n) {
        
        long l=1;
        long r=n;
        int res=0;
        while(l<=r)
        {
            long mid=l+(r-l)/2;
            // for mid rows we need this amount of coins
            long coins = (mid) *(mid+1)/2;

            // not possible as we have only n coins available, so go left
            if(coins > n)
            {
                r=mid-1;
            }
            else 
            {
                // go right for max no of rows possible
                l=mid+1;
                res=(int)Math.max(res,mid);
            }


        }
        return res;

    }
}
