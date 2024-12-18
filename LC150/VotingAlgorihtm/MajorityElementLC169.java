//O(n),O(1)
class Solution {
    public int majorityElement(int[] nums) {

        int count, res;
        count = res = 0;

        for (int n : nums) {
            if (count == 0)
                res = n;
            if (res == n)
                count++;
            else
                count--;
        }
        return res;

    }
}
