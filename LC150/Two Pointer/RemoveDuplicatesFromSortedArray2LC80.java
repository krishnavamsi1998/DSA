//O(n),O(1)
class Solution {
    public int removeDuplicates(int[] nums) {

        int l = 2;
        int r = 2;

        while (r < nums.length) {
            if (nums[l - 2] != nums[r]) {
                nums[l] = nums[r];
                l++;
            }
            r++;
        }

        return l;

    }
}
