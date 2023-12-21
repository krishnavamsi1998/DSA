//O(logn),O(n)
//neetcode
class Solution {
    public int findMin(int[] nums) {
        
        int res=nums[0];
        int l=0;
        int r=nums.length-1;

        while(l<=r)
        {
            //base case
            if(nums[l]<nums[r])
            {
                res=Math.min(res,nums[l]);
                break;
            }

            //calc mid
            int mid=l+(r-l)/2;
            res=Math.min(res,nums[mid]);

            if(nums[mid]>=nums[l])
            {
                //search right
                l=mid+1;
            }
            else
            {
                //search right
                r=mid-1;
            }
        }

        return res;

    }
}
