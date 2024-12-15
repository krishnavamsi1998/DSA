//O(n),O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        // k : pos to swap
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            // found a non val ele replace in k else ignore
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }

        }
        // after inserting all k is the no of ele that are non val
        return k;

    }
}
