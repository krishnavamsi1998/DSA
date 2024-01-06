//O(n*m),O(n)
//neetcode
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        //base case
        dp[n]=true;

        for(int i=n-1;i>=0;i--)
        {
            for(String word:wordDict)
            {
                int lenW=word.length();

                if(i+ lenW <= n && s.substring(i , i+lenW ).equals(word))
                    dp[i]=dp[i+ lenW];
                // no need to check next word, goto new index
                if(dp[i])
                    break;
            }
        }

        return dp[0];

    }
}
