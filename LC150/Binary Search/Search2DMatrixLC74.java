// O(logm*logn),O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int top = 0;
        int bot = matrix.length - 1;

        int cols = matrix[0].length;

        int m = 0;
        while (top <= bot) // find that row
        {
            m = (top + bot) / 2;

            if (target < matrix[m][0]) // go up
                bot = m - 1;
            else if (target > matrix[m][cols - 1]) // go down
                top = m + 1;
            else
                break; // search that row

        }

        int l = 0;
        int r = matrix[m].length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (matrix[m][mid] == target)
                return true;
            else if (target < matrix[m][mid])
                r = mid - 1;
            else
                l = mid + 1;
        }
        return false;

    }
}
