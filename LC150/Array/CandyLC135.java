//O(n),O(n)
class Solution {
    public int candy(int[] ratings) {

        int n = ratings.length;
        int[] candy = new int[n];

        // initlize with a minium of 1 candy
        for (int i = 0; i < n; i++)
            candy[i] = 1;

        // iterate from left
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1])
                candy[i] = candy[i - 1] + 1;

        }
        // example
        // 1 1 1 2 3 1
        // 5 4 3 5 6 2

        // looks like this after left iteration
        // itearte from right

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                // if already greater
                candy[i] = Integer.max(candy[i], candy[i + 1] + 1);
            }
        }
        // compute candy sum
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum = sum + candy[i];

        return sum;

    }
}
