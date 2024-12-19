//O(n),O(1)
//neetcode
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n=nums.length;
        int[] res=new int[n];

        for(int i=0;i<n;i++)
            res[i]=1;
        
        //compute prefix product
        int prefix=1;
        for(int i=0;i<n;i++)
        {
            res[i]=prefix;
            prefix=nums[i]*prefix;
        }
        //compute postfix product
        int postfix=1;
        for(int i=n-1;i>=0;i--)
        {
            //product of postfix and res[i] i.e prefix[i]
            res[i]=postfix*res[i];
            postfix=postfix*nums[i];
        }

        return res;
    }
}
