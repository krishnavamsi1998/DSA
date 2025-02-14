//O(logn),O(1)
class Solution {
    public int searchInsert(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int m = 0;

        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] == target)
                return m;// found , return its pos
            else if (target < nums[m])
                r = m - 1;
            else
                l = m + 1;

        }
        if (nums[m] < target) // [1,3,5,6] ,target = 2
            return m + 1;
        else
            return m; // [1,3,5,6],target= 0
    }
}
