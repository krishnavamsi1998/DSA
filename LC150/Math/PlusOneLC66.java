//O(n),O(1)
class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        // ex : 621, 699, 629
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else
                digits[i] = 0;
        }

        // 999 -> 000 ->1000

        int[] res = new int[n + 1];

        res[0] = 1;

        return res;

    }
}
