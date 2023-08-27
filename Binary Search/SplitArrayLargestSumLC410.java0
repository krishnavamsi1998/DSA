//O(nlog(sum)),O(1)
//neetcode
class Solution {
    public int splitArray(int[] nums, int k) {
        
        //min sum possible 
        int l=max(nums);
        //max sum possible
        int r=sum(nums);

        //worst case
        int res=r;

        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(canSplit(nums,mid,k))
            {
                res=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }

        }

        return res;

    }

    public boolean canSplit(int[] arr,int sum,int k)
    {
        int subArrays=0;
        int currSum=0;

        for(int n:arr)
        {       
            currSum+=n;
            if(currSum>sum){
                currSum=n;
                subArrays+=1;
            }
        }

        if(subArrays+1<=k)
            return true;
        return false;
    }

    public int sum(int[] arr)
    {
        int s=0;
        for(int n:arr)
            s+=n;
        return s;
    }

    public int max(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int n:arr)
        {
            if(n>max)
                max=n;
        }
        return max;
    }
}
