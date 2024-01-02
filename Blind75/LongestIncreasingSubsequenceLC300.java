//O(n2),O(n)
//neetcode
class Solution {
    public int lengthOfLIS(int[] nums) {

        int n=nums.length;
        // create an array of nums length
        int[] res=new int[n];
        // fill with 1
        for(int i=0;i<n;i++)        
            res[i]=1;

        //base case
        res[n-1]=1;
        
        // iterate each element from end and compare it from next element to end
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]<nums[j])
                    res[i]=Math.max(res[i],1+res[j]);
            }
        }

        // return the max element
        int max=0;

        for(int i:res)
        {
            if(i>max)
                max=i;
        }

        return max;       


    }
}
