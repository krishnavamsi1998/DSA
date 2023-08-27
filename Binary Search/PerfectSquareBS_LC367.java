//O(log n),O(1)
class Solution {
    public boolean isPerfectSquare(int num) {
        
        int l=1;
        int r=num;

        while(l<=r)
        {
            long mid=l+(r-l)/2;
            if(mid*mid > num)
                r=(int)mid-1;
            else if(mid*mid < num)
                l=(int)mid+1;
            else if(mid*mid == num)
                return true;

        }
        return false;
    }
}
