//O(logn),O(n)
class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            // cal mid
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // search target in right sorted portion
            else if (nums[mid] <= nums[r]) {
                if (nums[mid] <= target && target <= nums[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
            // search target in left sorted portion
            else {
                if (nums[l] <= target && target <= nums[mid])
                    r = mid - 1;
                else
                    l = mid + 1;

            }
        }
        return -1;

    }
}
