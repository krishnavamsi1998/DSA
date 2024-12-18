//O(n),O(1)
class Solution {
    public boolean canJump(int[] nums) {
        // come from last
        int goal = nums.length - 1;
        int i = goal - 1;

        while (i >= 0) {
            // if we can reach
            if (i + nums[i] >= goal) {
                goal = i;
            }
            i--;
        }

        // if goal is at 0 which means we can reach the goal
        return goal == 0;

    }
}
