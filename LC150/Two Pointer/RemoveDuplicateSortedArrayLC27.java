//O(n),O(1)
class Solution {
    public int removeDuplicates(int[] nums) {

        // check before ele and swap

        int l = 1;
        int r = 1;

        while (r < nums.length) {
            if (nums[r] != nums[r - 1]) {
                // found a new unique element
                nums[l] = nums[r];
                l++;

            }
            r++; // continue till next unique element
        }

        return l;

    }
}
