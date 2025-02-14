//O(logn),O(1)
class Solution {
    public int findPeakElement(int[] nums) {

        int l = 0;
        int r = nums.length - 1;
        int m = 0;

        while (l <= r) {
            m = l + (r - l) / 2;

            if (m > 0 && nums[m] < nums[m - 1]) // go left
                r = m - 1;
            else if (m < nums.length - 1 && nums[m] < nums[m + 1])// go right
                l = m + 1;
            else
                return m; // guranteed
        }
        return -1;
    }
}
