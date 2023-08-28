//O(logn),O(1)
//neetcode
class Solution {
    public int findMin(int[] nums) {
        
        int l=0;
        int r=nums.length-1;

        int res=nums[0]; 

        while(l<=r)
        {
            //already a sorted array , just res = left value
            if(nums[l]<nums[r])
            {
                res=Math.min(res,nums[l]);
                break;
            }

            int mid=l+(r-l)/2;
            res = Math.min(res, nums[mid]);
            //if left sub array
            if(nums[mid]>=nums[l]){
                //move right
                l=mid+1;
            }
            else{
                //move left
                r=mid-1;
            }
        
        }

        return res;
    }
}
