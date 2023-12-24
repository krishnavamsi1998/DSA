//O(n),O(1)
//neetcode
class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxArea=0;

        while(l<r)
        {
            //cal area
            // area= width * height
            // width = r-l
            // height = min (height[l],height[r])

            int area= (r-l) * Math.min(height[l],height[r]);
            maxArea=Math.max(maxArea,area);

            if(height[l]<height[r])
                l++;
            else
                r--;

        }
        return maxArea;

    }
}
