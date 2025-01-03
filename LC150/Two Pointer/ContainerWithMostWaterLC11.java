//O(n),O(1)
class Solution {
    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;
        int res = 0;

        while (l < r) {
            int area = (r - l) * Integer.min(height[l], height[r]);
            if (area > res)
                res = area;
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return res;

    }
}
