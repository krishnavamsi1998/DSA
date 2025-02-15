//O(2*logn),O(1)
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] res = new int[2];

        res[0] = bs(nums, target, true);
        res[1] = bs(nums, target, false);

        return res;
    }

    public int bs(int[] nums, int t, boolean leftBiased) {
        int index = -1;
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] < t)
                l = mid + 1;
            else if (nums[mid] > t)
                r = mid - 1;
            else if (nums[mid] == t) {
                index = mid;
                if (leftBiased)
                    r = mid - 1;
                else
                    l = mid + 1;

            }

        }

        return index;

    }
}
