//O(logn),O(1)
class Solution {
    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[l] <= nums[r])// already sorted
                return nums[l];
            else if (nums[mid] >= nums[l])// search right
                l = mid + 1;
            else //search left
                r = mid;

        }
        return nums[l];// always minimum

    }
}
