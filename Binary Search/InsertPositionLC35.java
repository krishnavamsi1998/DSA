//O(logn),O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int n=nums.length;
        int l=0;
        int r=n-1;

        while(l<=r)
        {
            //avoid overflow
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        //insert pos
        return l;
    }
}
